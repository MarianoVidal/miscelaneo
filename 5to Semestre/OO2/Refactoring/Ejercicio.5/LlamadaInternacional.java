package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class LlamadaInternacional extends Llamada {
	//
	public LlamadaInternacional(Cliente origen, Cliente destino, int duracion) {
		super(origen, destino, duracion);
	}

	@Override
	public double getPrecio() { return 150; }
	
	@Override
	public double calcularMonto() {
		return super.calcularMonto() + 50;
	}
}