package unlp.oo2.refactoring;

public class FormaPagoSeisCuotas implements IFormaPago {
	public double calcularValor(double costo) {
		return costo * 0.2;
	}
}