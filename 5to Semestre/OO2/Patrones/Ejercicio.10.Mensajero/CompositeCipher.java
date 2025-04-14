package unlp.oo2.patrones.ej10;

import java.util.ArrayList;
import java.util.List;

public class CompositeCipher implements ICipher {
	private List<ICipher> cifradores;
	
	public CompositeCipher() {
		this.cifradores = new ArrayList<ICipher>();
	}
	
	public void agregarCifrador(ICipher unCifrador) {
		this.cifradores.add(unCifrador);
	}
	
	public void quitarCifrador(ICipher unCifrador) {
		this.cifradores.remove(unCifrador);
	}
	
	// Métodos de la interfaz implementada
	public String encriptar(String mensaje) {
		String mensajeEncriptado = mensaje;
		for (ICipher cifr : this.cifradores)
			mensajeEncriptado = cifr.encriptar(mensajeEncriptado);
		return mensajeEncriptado;
	}
	
	public String desencriptar(String mensaje) {
		String mensajeDesencriptado = mensaje;
		for (ICipher cifr : this.cifradores.reversed())
			mensajeDesencriptado = cifr.desencriptar(mensajeDesencriptado);
		return mensajeDesencriptado;
	}
}