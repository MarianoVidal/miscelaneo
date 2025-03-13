package unlp.oo2.ejercicio2;

import java.util.stream.Stream;
import java.util.Arrays;

public abstract class Opcion {
	private String nombreElemento;
	// Arreglo en el que van a estar las opciones contra las que gana
	private String[] ganaContra = new String[2];
	// No hace falta poner las opciones contra las que pierde ya que se infiere
	// de lo que falta
	
	protected Opcion(String nombreElemento) {
		this.nombreElemento = nombreElemento;
	}
	
	// Métodos públicos
	public String jugarContra(Opcion otraOpcion) {
		String nombre2 = otraOpcion.getNombreElemento();
		return (this.siEsElMismoElemento(nombre2) ? "Hay empate" : (
				this.siLeGana(nombre2) ? this.anunciarResultado("ganó contra", nombre2) : 
					this.anunciarResultado("perdió contra", nombre2)));
	}
	
	public String getNombreElemento() { return this.nombreElemento; }
	
	// Métodos para que usen las clases
	protected boolean siEsElMismoElemento(String nombre) {
		return (this.nombreElemento == nombre);
	}
	
	protected boolean siLeGana(String nombre) {
		boolean estaDentro = this.streamizer(this.ganaContra).anyMatch(str -> str == nombre);
		return estaDentro;
	}
	
	protected void definirContraQuienGana(String[] vector) {
		this.ganaContra = vector;
	}
	
	// Métodos auxiliares
	private Stream<String> streamizer(String[] vector) {
		return Arrays.stream(vector);
	}
	
	private String anunciarResultado(String motivo, String otroNombre) {
		return (this.nombreElemento + " " + motivo + " " + otroNombre);
	}
}
