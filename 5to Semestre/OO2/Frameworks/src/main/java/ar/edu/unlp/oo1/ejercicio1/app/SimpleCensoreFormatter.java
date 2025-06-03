package ar.edu.unlp.oo1.ejercicio1.app;

import java.util.List;
import java.util.logging.LogRecord;
import java.util.logging.SimpleFormatter;

public class SimpleCensoreFormatter extends SimpleFormatter {
	List<String> palabrasCensurables;
	//
	public SimpleCensoreFormatter(List<String> palabrasCensurables) {
		this.palabrasCensurables = palabrasCensurables;
	}
	
	// INTERFAZ PÚBLICA
	
	public void agregarPalabraCensurable(String palabra) {
		this.palabrasCensurables.add(palabra);
	}
	
	@Override
	public String format(LogRecord record) {
		String mensajeCensurado = censurarMensaje(record.getMessage());
		String cadena = record.getLevel().toString() + ": " + mensajeCensurado + "\n";
		return cadena;
	}
	
	// Métodos internos
	private String censurarMensaje(String mensaje) {
		System.out.println(palabrasCensurables);
		for (String palabra : this.palabrasCensurables)
			mensaje.replaceAll("\\" + palabra + "\\b", "***");
		return mensaje;
	}
}