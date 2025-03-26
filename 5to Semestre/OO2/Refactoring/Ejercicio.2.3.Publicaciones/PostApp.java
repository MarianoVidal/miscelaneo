package unlp.oo2.refactoring;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PostApp {
	private List<Post> posts;
	
	public List<Post> ultimosPosts(Usuario user, int cantidad) {
	    List<Post> postsOtrosUsuarios = obtenerPostsOtrosUsuarios(user);
	    ordenarPostsPorFecha(postsOtrosUsuarios);
	    List<Post> ultimosPosts = obtenerUltimosPosts(cantidad, postsOtrosUsuarios);
	    
	    return ultimosPosts;
	}

	private List<Post> obtenerUltimosPosts(int cantidad, List<Post> postsOtrosUsuarios) {
		return postsOtrosUsuarios.stream().limit(3).toList();
	}

	private void ordenarPostsPorFecha(List<Post> postsOtrosUsuarios) {
		postsOtrosUsuarios.stream().sorted((p1, p2) -> p1.getFecha().compareTo(p2.getFecha())).toList();
	}

	private List<Post> obtenerPostsOtrosUsuarios(Usuario user) {
		return this.posts.stream().filter(p -> p.getUsuario() != user).toList();
	}
}
