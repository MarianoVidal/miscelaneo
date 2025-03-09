package unlp.oo2.ejercicio1;

import java.util.List;
import java.util.ArrayList;

public class Sistema {
	private List<Usuario> usuariosRegistrados;
	private RetweetHandler manejadorRetweets;
	
	public Sistema() {
		this.usuariosRegistrados = new ArrayList<Usuario>();
		this.manejadorRetweets = new RetweetHandler();
	}
	
	// Métodos públicos
	public Usuario registrarUsuario(String screenName) {
		Usuario usuario = null;
		
		if (!this.nombreExistente(screenName)) {
			// Inyección de dependencias
			usuario = new Usuario(screenName, this.manejadorRetweets);
			
			this.usuariosRegistrados.add(usuario);
			this.manejadorRetweets.observarLista(usuario.getRetweets());
		}
		
		return usuario;
	}
	
	// Métodos privados
	private boolean nombreExistente(String screenName) {
		return this.usuariosRegistrados.stream().anyMatch(usu -> usu.getScreenName() == screenName);
	}
}
