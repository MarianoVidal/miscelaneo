package unlp.oo2.patrones.ej12;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Archivo extends Unidad {
	//
	public Archivo(String nombre, LocalDate fechaCreacion, int tamañoBytes) {
		super(nombre, fechaCreacion, tamañoBytes);
	}
	
	// INTERFAZ PÚBLICA
	
	public String toString(String anterior) { return this.getNombre(); }
	public boolean estaVacio() { return true; }
	public boolean esArchivo() { return true; }
	public List<Unidad> obtenerContenido() {
		List<Unidad> listaUnSoloElemento = new ArrayList<Unidad>();
		listaUnSoloElemento.add(this);
		return listaUnSoloElemento;
	}
}