package ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {
	//título, año de estreno, películas similares y puntaje
	private String titulo;
	private int añoEstreno;
	private List<Pelicula> peliculasSimilares;
	private double puntaje;
	
	public Pelicula(
			String titulo, 
			int añoEstreno, 
			List<Pelicula> peliculasSimilares, 
			double puntaje) {
		this.titulo = titulo;
		this.añoEstreno = añoEstreno;
		this.peliculasSimilares = (peliculasSimilares != null 
					? peliculasSimilares 
					: new ArrayList<Pelicula>()
				);
		this.puntaje = puntaje;
	}
	
	public void agregarPeliculaSimilar(Pelicula p) {
		if (p != null) this.peliculasSimilares.add(p);
	}
	
	public boolean esSimilarA(Pelicula p) {
		return (this.peliculasSimilares.contains(p));
	}
	
	public double getPuntaje() { return this.puntaje; }
	public int getAñoEstreno() { return this.añoEstreno; }
}