package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class ConstructorLlamadaInternacional extends ConstructorLlamada {
	//
	// INTERFAZ PÚBLICA
	
	@Override
	public Llamada construirLlamada() {
		return new LlamadaInternacional(this.origen, this.destino, this.duracion);
	}
}