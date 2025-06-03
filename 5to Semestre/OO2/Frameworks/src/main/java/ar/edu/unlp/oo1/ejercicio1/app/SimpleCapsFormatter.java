package ar.edu.unlp.oo1.ejercicio1.app;

import java.util.logging.LogRecord;
import java.util.logging.SimpleFormatter;

public class SimpleCapsFormatter extends SimpleFormatter {
	//
	// INTERFAZ PÚBLICA
	
	@Override
	public String format(LogRecord record) {
		String cadena = record.getLevel().toString() + ": " + record.getMessage().toUpperCase() + "\n";
		return cadena;
	}
}