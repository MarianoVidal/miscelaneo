package unlp.oo2.ejercicio2;

public class Papel extends Opcion {
	String[] ganaContra = {"Piedra", "Spock"};
	
	public Papel() {
		super("Papel");
		this.definirContraQuienGana(ganaContra);
	}
}
