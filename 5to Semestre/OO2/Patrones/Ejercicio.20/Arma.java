package unlp.oo2.patrones.ej20;

public abstract class Arma {
	public int obtenerDaño(Armadura armadura) {
		return armadura.calcularDaño(this);
	}
}