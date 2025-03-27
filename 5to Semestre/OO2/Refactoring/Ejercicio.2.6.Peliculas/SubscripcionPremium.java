package unlp.oo2.refactoring;

public class SubscripcionPremium implements ISubscripcion {
    public double calcularCostoPelicula(Pelicula pelicula) {
	   	 return pelicula.getCosto() * 0.75;
	}
}