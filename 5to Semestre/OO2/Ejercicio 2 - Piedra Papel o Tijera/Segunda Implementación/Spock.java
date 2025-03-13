package unlp.oo2.ejercicio2;

public class Spock extends Opcion {
	String[] ganaContra = {"Tijera", "Piedra"};
	
	public Spock() {
		super("Spock");
		this.definirContraQuienGana(ganaContra);
	}
}
