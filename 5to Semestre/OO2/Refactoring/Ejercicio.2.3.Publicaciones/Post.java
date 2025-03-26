package unlp.oo2.refactoring;

import java.time.LocalDateTime;

public class Post {
	private String texto;
	private LocalDateTime fecha;
	private Usuario usuario;
	
	public Usuario getUsuario() {
		return this.usuario;
	}
	
	public LocalDateTime getFecha() {
		return fecha;
	}
}