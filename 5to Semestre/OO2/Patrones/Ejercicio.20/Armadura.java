package unlp.oo2.patrones.ej20;

public abstract class Armadura {
	public abstract int calcularDaño(Arma arma);
	public abstract int calcularDaño(Espada espada);
	public abstract int calcularDaño(Baston baston);
	public abstract int calcularDaño(Arco arco);
}