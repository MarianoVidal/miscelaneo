package unlp.oo2.ejercicio2;

public class Tijera extends Opcion {
	String[] ganaContra = {"Papel", "Lagarto"};
	
	public Tijera() {
		super("Tijera");
		this.definirContraQuienGana(ganaContra);
	}
}
