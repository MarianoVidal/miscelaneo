package unlp.oo2.ejercicio2;

public abstract class Opcion {
	// Aplicar sobrecarga de métodos
	
	public abstract String juegoContra(Piedra piedra);
	public abstract String juegoContra(Papel papel);
	public abstract String juegoContra(Tijera tijera);
	
	protected String hayEmpate() { return "Hay empate"; }
}
