package unlp.oo2.refactoring;

import java.util.List;

public abstract class Usuario {
	String nombre;
	int telefono;
    String email;
    ISubscripcion subscripcion;
    List<Pelicula> peliculasCompradas;
    
    public double calcularCostoPelicula(Pelicula pelicula) {
    	return subscripcion.calcularCostoPelicula(pelicula);
    }
}