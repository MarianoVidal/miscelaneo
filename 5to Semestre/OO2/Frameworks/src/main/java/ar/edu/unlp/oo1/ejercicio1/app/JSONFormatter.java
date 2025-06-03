package ar.edu.unlp.oo1.ejercicio1.app;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class JSONFormatter extends Formatter {
	//
	// INTERFAZ PÚBLICA
	
	@Override
	public String format(LogRecord record) {
		String cadena = "{ \"message\": \"" + record.getMessage() + "\", \"level\": " 
							+ record.getLevel() + "\" }";
		return cadena + "\n";
	}
}