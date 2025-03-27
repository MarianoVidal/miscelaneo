package unlp.oo2.refactoring;

public class SubscripcionPlus implements ISubscripcion {
    public double calcularCostoPelicula(Pelicula pelicula) {
	   	 return pelicula.getCosto();
	}
}