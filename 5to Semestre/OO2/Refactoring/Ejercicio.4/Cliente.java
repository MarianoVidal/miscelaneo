package unlp.oo2.refactoring;

import java.time.LocalDate;
import java.time.Period;

public class Cliente {
	private LocalDate fechaAlta;
	public LocalDate getFechaAlta() {
		return this.fechaAlta;
	}
	
	public int calcularAñosDesdeFechaAlta() {
		return Period.between(this.getFechaAlta(), LocalDate.now()).getYears();
	}
}