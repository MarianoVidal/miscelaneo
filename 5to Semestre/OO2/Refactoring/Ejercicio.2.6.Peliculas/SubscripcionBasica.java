package unlp.oo2.refactoring;

public class SubscripcionBasica implements ISubscripcion {

    public double calcularCostoPelicula(Pelicula pelicula) {
	   	 return pelicula.calcularCostoTotal();
	}
}