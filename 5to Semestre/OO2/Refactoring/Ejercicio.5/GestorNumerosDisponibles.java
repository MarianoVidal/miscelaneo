package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Random;
import java.util.SortedSet;

public class GestorNumerosDisponibles {
	private SortedSet<String> lineas;
	private IGenerador generador;
	
	public GestorNumerosDisponibles() {
		this.lineas = new TreeSet<String>();
		this.generador = new GeneradorUltimo();
	}

	public SortedSet<String> getLineas() {
		return lineas;
	}

	public String obtenerNumeroLibre() {
		return this.generador.obtenerNumeroLibre(this.lineas);
	}

	public void cambiarGenerador(IGenerador generador) {
		this.generador = generador;
	}

	public boolean agregarNumeroTelefono(String str) {
		if (!this.getLineas().contains(str)) {
			this.getLineas().add(str);
			return true;
		}
		return false;
	}
}
