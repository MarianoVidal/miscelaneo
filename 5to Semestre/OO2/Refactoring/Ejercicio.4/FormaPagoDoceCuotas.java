package unlp.oo2.refactoring;

public class FormaPagoDoceCuotas implements IFormaPago {
	public double calcularValor(double costo) {
		return costo * 0.5;
	}
}