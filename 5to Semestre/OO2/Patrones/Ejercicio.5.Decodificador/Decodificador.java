package ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Decodificador {
	private List<Pelicula> grilla;
	private ISugeridor sugeridor;
	
	public Decodificador(List<Pelicula> grilla, ISugeridor sugeridor) {
		this.grilla = (grilla != null ? grilla : new ArrayList<Pelicula>());
		this.sugeridor = sugeridor;
	}
	
	public void setSugeridor(ISugeridor s) {
		this.sugeridor = s;
	}
}
