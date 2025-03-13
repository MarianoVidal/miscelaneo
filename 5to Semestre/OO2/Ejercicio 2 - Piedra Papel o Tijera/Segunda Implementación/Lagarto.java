package unlp.oo2.ejercicio2;

public class Lagarto extends Opcion {
	String[] ganaContra = {"Papel", "Spock"};
	
	public Lagarto() {
		super("Lagarto");
		this.definirContraQuienGana(ganaContra);
	}
}
