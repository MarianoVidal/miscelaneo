package unlp.oo2.patrones.ej20;

public class ArmaduraDeHierro extends Armadura {
	//
	public int calcularDaño(Arma arma) { return 0; }
	public int calcularDaño(Espada espada) { return 5; }
	public int calcularDaño(Baston baston) { return 3; }
	public int calcularDaño(Arco arco) { return 1; }
}