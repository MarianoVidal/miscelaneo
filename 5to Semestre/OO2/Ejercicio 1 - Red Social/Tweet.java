package unlp.oo2.ejercicio1;

public class Tweet {
	private String contenido;
	
	public Tweet() {}
	
	// Métodos públicos
	public boolean establecerContenido(String contenido) {
		int longitud = contenido.length();
		
		// Los mensajes pueden tener hasta 280 carácteres
		if (longitud < 1 || longitud > 280)
			return false;
		
		setContenido(contenido);
		return true;
	}
	
	public String getContenido() {
		return this.contenido;
	}
	
	// Métodos privados
	private void setContenido(String contenido) {
		this.contenido = contenido;
	}
}
