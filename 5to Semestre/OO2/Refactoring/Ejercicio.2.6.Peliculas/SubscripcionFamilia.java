package unlp.oo2.refactoring;

public class SubscripcionFamilia implements ISubscripcion {
    public double calcularCostoPelicula(Pelicula pelicula) {
	   	 return pelicula.calcularCostoTotal() * 0.90;
	}
}