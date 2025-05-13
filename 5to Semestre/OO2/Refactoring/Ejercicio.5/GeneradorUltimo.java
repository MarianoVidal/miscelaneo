package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.SortedSet;

public class GeneradorUltimo implements IGenerador {
	//
	public String obtenerNumeroLibre(SortedSet<String> lineas) {
		String linea = lineas.last();
		lineas.remove(lineas.last());
		return linea;
	}
}