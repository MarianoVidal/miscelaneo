package unlp.oo2.patrones.ej15;

public class GabineteEstandar extends Componente implements IGabinete {
	//
	public GabineteEstandar(double precio, double consumo) { 
		super("gabinete estandar", "gabinete estandar", precio, consumo);
	}
	
	// INTERFAZ PÚBLICA
	
	public String obtenerFuente() { return "fuente" + this.getConsumo() + "w"; }
}