package ejercicio5;

import java.util.List;

public interface ISugeridor {
	public abstract Pelicula[] retornarSugerencias(List<Pelicula> peliculas);
}