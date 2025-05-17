package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class ConstructorLlamadaNacional extends ConstructorLlamada {
	//
	// INTERFAZ PÚBLICA
	
	@Override
	public Llamada construirLlamada() {
		return new LlamadaNacional(this.origen, this.destino, this.duracion);
	}
}