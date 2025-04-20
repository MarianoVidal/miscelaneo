package unlp.oo2.patrones.ej12;

import java.time.LocalDate;
import java.util.List;

public class FileSystem {
	private Directorio directorioRaiz;
	
	//
	
	public FileSystem() {
		this.directorioRaiz = new Directorio("", LocalDate.now());
	}
	
	// INTERFAZ PÚBLICA
	
	// Retorna el espacio total ocupado, incluyendo todo
	// su contenido.
	public int tamanoTotalOcupado() {
		return this.directorioRaiz.obtenerTamañoTotal();
	}

	// Retorna el archivo con mayor cantidad de bytes en 
	// cualquier nivel del filesystem 	  
	public Archivo archivoMasGrande() {
		return this.directorioRaiz.obtenerArchivoMasGrande();
	}

	// Retorna el archivo con fecha de creación más  
	// reciente en cualquier nivel del filesystem
	public Archivo archivoMasNuevo() {
		return this.directorioRaiz.obtenerArchivoMasNuevo();
	}

	// Retorna el primer elemento con el nombre 
	// solicitado contenido en cualquier nivel del 
	// filesystem
	public Unidad buscar(String nombre) {
		return this.directorioRaiz.obtenerUnidadPorNombre(nombre);
	}

	// Retorna la lista con los elementos que  
	// coinciden con el nombre solicitado contenido 
    // en cualquier nivel del filesystem
	public List<Unidad> buscarTodos(String nombre) {
		return this.directorioRaiz.obtenerUnidadesPorNombre(nombre);
	}

	// Retorna un String con los nombres de los elementos  
	// contenidos en todos los niveles del filesystem.
	public String listadoDeContenido() { 
		return this.directorioRaiz.toString("");
	}
	
	// Otros métodos
	public void moverUnidad(Unidad u) { this.directorioRaiz.moverUnidad(u); }
	public void eliminarUnidad(Unidad u) { this.directorioRaiz.eliminarUnidad(u); }
	public boolean estaVacio() { return this.directorioRaiz.estaVacio(); }
}