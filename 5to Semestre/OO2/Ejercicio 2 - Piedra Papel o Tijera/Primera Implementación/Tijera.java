package unlp.oo2.ejercicio2;

public class Tijera extends Opcion {
	// Implementar métodos abstractos
	
	public String juegoContra(Tijera tijera) {
		return this.hayEmpate();
	}
	
	public String juegoContra(Piedra piedra) {
		return "La piedra aplasta la tijera";
	}
	
	public String juegoContra(Papel papel) {
		return "La tijera corta el papel";
	}
}
