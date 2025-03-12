package unlp.oo2.ejercicio2;

public class Papel extends Opcion {
	// Implementar métodos abstractos
	
	public String juegoContra(Papel papel) {
		return this.hayEmpate();
	}
	
	public String juegoContra(Piedra piedra) {
		return "El papel envuelve la piedra";
	}
	
	public String juegoContra(Tijera tijera) {
		return "La tijera corta el papel";
	}
}
