package unlp.oo2.patrones.ej15;

public class GabineteIntermedio extends Componente implements IGabinete {
	private int fuente;
	//
	public GabineteIntermedio(double precio) { 
		super("gabinete intermedio", "gabinete intermedio", precio, 800);
	}
	
	// INTERFAZ PÚBLICA
	
	public String obtenerFuente() { return "fuente 800 w"; }
}