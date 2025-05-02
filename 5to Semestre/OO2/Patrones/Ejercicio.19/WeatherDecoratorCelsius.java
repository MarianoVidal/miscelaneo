package unlp.oo2.patrones.ej19;

// Asumo que esta clase solo se utiliza después del
// HomeWeatherStation, porque si no claramente está mal

public class WeatherDecoratorCelsius extends WeatherDecorator {
	//
	public WeatherDecoratorCelsius(WeatherData componente) {
		super(componente);
	}
	
	// INTERFAZ PÚBLICA
	
	@Override
	public double getTemperatura() {
		double conversion = (this.getComponente().getTemperatura() - 32) / 1.8;
		return conversion;
	}
	
	@Override
    public String displayData() {
        return "Temperatura C: " + this.getComponente().getTemperatura() +
               "; Presión atmosf: " + this.getComponente().getPresion() +
               "; Radiación solar: " + this.getComponente().getRadiacionSolar() + ";";
    }
}