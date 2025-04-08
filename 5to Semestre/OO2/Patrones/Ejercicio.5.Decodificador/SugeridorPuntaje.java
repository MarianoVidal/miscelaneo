package ejercicio5;

import java.util.List;

public class SugeridorPuntaje implements ISugeridor {
	
	public Pelicula[] retornarSugerencias(List<Pelicula> peliculas) {
		// Recorrer la lista
		peliculas.stream().sorted(
					(peli1, peli2) 
					-> peli1.getAñoEstreno().compareTo(peli2.getAñoEstreno())
					)
				
				)
	}
}