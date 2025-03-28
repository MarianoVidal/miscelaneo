package unlp.oo2.refactoring;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pelicula {
    LocalDate fechaEstreno;
    String nombre;
    String genero;
    double costo;

    public double getCosto() {
   	 	return this.costo;
    }
    
    public double calcularCargoExtraPorEstreno(){
    	return (estrenoOcurrioHaceUnMes() ? 0 : 300);
    }

	double calcularCostoTotal() {
		return getCosto() + calcularCargoExtraPorEstreno();
	}
	
	private boolean estrenoOcurrioHaceUnMes() {
		return (ChronoUnit.DAYS.between(this.fechaEstreno, LocalDate.now()) > 30);
	}
}