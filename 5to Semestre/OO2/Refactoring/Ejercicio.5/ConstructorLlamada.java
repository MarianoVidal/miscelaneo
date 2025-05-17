package ar.edu.unlp.info.oo2.facturacion_llamadas;

public abstract class ConstructorLlamada {
	protected Cliente origen;
	protected Cliente destino;
	protected int duracion;
	//
	// INTERFAZ PÚBLICA
	
	public void setOrigen(Cliente origen) {
		this.origen = origen;
	}

	public void setDestino(Cliente destino) {
		this.destino = destino;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	public abstract Llamada construirLlamada();
}