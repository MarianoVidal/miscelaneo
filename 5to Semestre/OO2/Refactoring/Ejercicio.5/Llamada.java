package ar.edu.unlp.info.oo2.facturacion_llamadas;

public abstract class Llamada {
	private Cliente origen;
	private Cliente destino;
	private int duracion;

	public Llamada(Cliente origen, Cliente destino, int duracion) {
		this.origen= origen;
		this.destino= destino;
		this.duracion = duracion;
	}

	public Cliente getRemitente() {
		return destino;
	}

	public int getDuracion() {
		return this.duracion;
	}

	public Cliente getOrigen() {
		return origen;
	}
	
	public double calcularMonto() {
		double monto = this.getDuracion() * this.getPrecio() + (this.getDuracion() * this.getPrecio() * 0.21);
		return monto;
	}
	
	public abstract double getPrecio();
}