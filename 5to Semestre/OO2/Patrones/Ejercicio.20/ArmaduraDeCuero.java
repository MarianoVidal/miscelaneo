package unlp.oo2.patrones.ej20;

public class ArmaduraDeCuero extends Armadura {
	//
	public int calcularDaño(Arma arma) { return 0; }
	public int calcularDaño(Espada espada) { return 8; }
	public int calcularDaño(Baston baston) { return 5; }
	public int calcularDaño(Arco arco) { return 1; }
}