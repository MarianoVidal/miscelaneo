package unlp.oo2.patrones.ej12;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Directorio extends Unidad {
	private List<Unidad> contenido;
	
	//
	
	public Directorio(String nombre, LocalDate fechaCreacion) {
		// Por enunciado, el directorio de por sí ocupa 32kb
		super(nombre, fechaCreacion, 32);
		// Asumo que el directorio se crea vacío
		this.contenido = new ArrayList<Unidad>();
	}
	
	// INTERFAZ PÚBLICA
	
	public int obtenerTamañoTotal() {
		int sumatoria = this.obtenerContenido().stream()
				.mapToInt(u -> u.getTamañoEnBytes())
				.sum();
		
		return sumatoria;
	}
	
	public Archivo obtenerArchivoMasGrande() {
		List<Archivo> listaArchivos = this.obtenerArchivos();
		Archivo archivoBuscado = listaArchivos.stream()
			.sorted((a2, a1) -> 
				Integer.compare(a1.getTamañoEnBytes(), a2.getTamañoEnBytes()))
			.findFirst()
			.orElse(null);
		
		return archivoBuscado;
	}
	
	public Archivo obtenerArchivoMasNuevo() {
		List<Archivo> listaArchivos = this.obtenerArchivos();
		Archivo archivoBuscado = listaArchivos.stream()
			.sorted((a2, a1) -> a1.getFechaCreacion().compareTo(a2.getFechaCreacion()))
			.findFirst()
			.orElse(null);
		
		return archivoBuscado;
	}
	
	public List<Unidad> obtenerUnidadesPorNombre(String nombre) {
		return this.obtenerContenido().stream()
				.filter(u -> u.getNombre().equals(nombre))
				.toList();
	}
	
	public Unidad obtenerUnidadPorNombre(String nombre) {
		Unidad unidadBuscada = this.obtenerUnidadesPorNombre(nombre).stream()
				.findFirst().orElse(null);
		
		return unidadBuscada;
	}
	
	// Operar con el directorio
	
	public Archivo crearArchivo(String nombre, int tamañoEnBytes) {
		Archivo nuevoArchivo = new Archivo(nombre, LocalDate.now(), tamañoEnBytes);
		this.contenido.add(nuevoArchivo);
		return nuevoArchivo;
	}
	
	public Directorio crearDirectorio(String nombre) {
		Directorio nuevoDirectorio = new Directorio(nombre, LocalDate.now());
		this.contenido.add(nuevoDirectorio);
		return nuevoDirectorio;
	}
	
	public void moverUnidad(Unidad u) {
		if (sePuedeContener(u))
			this.contenido.add(u);
	}
	
	public void eliminarUnidad(Unidad u) {
		if (this.contenido.contains(u))
			this.contenido.remove(u);
	}
	
	public String toString(String anterior) {
		String cadenaInicial = anterior + "/" + this.getNombre();
		String cadenaCompleta = "";
		
		for (Unidad u : this.contenido) {
			cadenaCompleta += (u.estaVacio() || u.esArchivo() ? cadenaInicial + "/" + u.getNombre() + "\n" : u.toString(cadenaInicial));
		}
		
		return cadenaCompleta;
	}
	
	public boolean estaVacio() { return this.contenido.size() == 0; }
	
	public List<Unidad> obtenerContenido() {
		List<Unidad> lista = new ArrayList<Unidad>();
		
		// No tenía ganas de tardar tiempo con esto, usé cosas de AYED
		if (this.estaVacio() || this.esArchivo()) {
			lista.add(this);
		} else {
			for (Unidad u : this.contenido) {
				lista.addAll(u.obtenerContenido());
				if (!lista.contains(this))
					lista.add(this);
			}
		}
		
		return lista;
	}
	
	public boolean esArchivo() { return false; }
	
	// MÉTODOS PRIVADOS
	
	// -- No sé si tengo que controlar que un directorio
	// -- no se pueda agregar si es el mismo, si está
	// -- contenido dentro de otro directorio que contiene
	// -- el primero, y demás
	private boolean sePuedeContener(Unidad u) {
		boolean seEncuentraDentro = this.contenido.contains(u);
		boolean esElMismoObjeto = this.equals(u);
		
		return (!seEncuentraDentro && !esElMismoObjeto);
	}
	
	// -- No me gusta tener que usar un cast
	// -- tiene que haber una mejor forma, consultar
	private List<Archivo> obtenerArchivos() {
		List<Archivo> lista = new ArrayList<Archivo>();
		
		this.obtenerContenido().stream()
		.filter(u -> u.esArchivo()).forEach(a -> { lista.add((Archivo) a); });
		
		return lista;
	}
}