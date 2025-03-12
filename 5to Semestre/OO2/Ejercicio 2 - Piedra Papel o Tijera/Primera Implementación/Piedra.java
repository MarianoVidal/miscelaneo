package unlp.oo2.ejercicio2;

public class Piedra extends Opcion {
	// Implementar métodos abstractos
	
	public String juegoContra(Piedra piedra) {
		return this.hayEmpate();
	}
	
	public String juegoContra(Papel papel) {
		return "El papel envuelve la piedra";
	}
	
	public String juegoContra(Tijera tijera) {
		return "La piedra aplasta la tijera";
	}
}
