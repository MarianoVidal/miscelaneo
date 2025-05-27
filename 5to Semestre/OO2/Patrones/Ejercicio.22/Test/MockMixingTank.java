package unlp.oo2.patrones.ej22;

public class MockMixingTank implements MixingTank {
	final int LIMITE_INFERIOR = 0;
	final int LIMITE_SUPERIOR = 100;
	//
	private int potenciaCalor;
	private int potenciaMezclador;
	private double volumenOcupado;
	private double temperatura;
	//
	public MockMixingTank(double volumenOcupado, double temperatura) {
		excepcionNumeroInvalido(volumenOcupado);
		
		this.volumenOcupado = volumenOcupado;
		this.temperatura = temperatura;
	}
	
	// INTERFAZ PÚBLICA
	
	@Override
	public boolean heatPower(int percentage) {
		if (esUnNumeroValido(percentage)) {
			this.potenciaCalor = percentage;
			return true;
		}
		return false;
	}
	
	@Override
	public boolean mixerPower(int percentage) {
		if (esUnNumeroValido(percentage)) {
			this.potenciaMezclador = percentage;
			return true;
		}
		return false;
	}
	
	@Override
	public boolean purge() {
		if (this.volumenOcupado > 0) {
			this.volumenOcupado = 0;
			return true;
		}
		return false;
	}
	
	@Override
	public double upTo() {
		return this.volumenOcupado;
	}
	
	@Override
	public double temperature() {
		return this.temperatura;
	}
	
	public int getHeatPower() {
		return this.potenciaCalor;
	}
	
	public int getMixerPower() {
		return this.potenciaMezclador;
	}
	
	// Métodos internos
	
	private boolean esUnNumeroValido(double numero) {
		return (numero >= LIMITE_INFERIOR &&
			numero <= LIMITE_SUPERIOR);
		}
	
	private void excepcionNumeroInvalido(double numero) {
		if (!esUnNumeroValido(numero))
			throw new IndexOutOfBoundsException("El número ingresado se sale del rango del 1 al 100");
	}
}