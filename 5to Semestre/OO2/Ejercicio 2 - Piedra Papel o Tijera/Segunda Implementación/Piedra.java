package unlp.oo2.ejercicio2;

public class Piedra extends Opcion {
	String[] ganaContra = {"Tijera", "Lagarto"};
	
	public Piedra() {
		super("Piedra");
		this.definirContraQuienGana(ganaContra);
	}
}
