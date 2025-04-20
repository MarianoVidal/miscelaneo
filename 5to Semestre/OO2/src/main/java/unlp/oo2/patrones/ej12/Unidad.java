package unlp.oo2.patrones.ej12;

import java.time.LocalDate;
import java.util.List;

public abstract class Unidad {
	private String nombre;
	private LocalDate fechaCreacion;
	private int tamañoBytes;
	
	//
	
	public Unidad(String nombre, LocalDate fechaCreacion, int tamañoBytes) {
		this.nombre = nombre;
		this.fechaCreacion = fechaCreacion;
		this.tamañoBytes = tamañoBytes;
	}
	
	// INTERFAZ PÚBLICA
	
	public String getNombre() { return this.nombre; }
	public LocalDate getFechaCreacion() { return this.fechaCreacion; }
	public int getTamañoEnBytes() { return this.tamañoBytes; }
	
	public abstract boolean estaVacio();
	public abstract boolean esArchivo();
	public abstract List<Unidad> obtenerContenido();
	public abstract String toString(String anterior);
}
