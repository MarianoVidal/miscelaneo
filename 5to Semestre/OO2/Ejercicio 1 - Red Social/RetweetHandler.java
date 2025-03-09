package unlp.oo2.ejercicio1;

import java.util.List;
import java.util.ArrayList;

// Este objeto funciona como una especie de GarbageCollector

public class RetweetHandler {
	private List<List<Retweet>> listasRetweets;
	
	public RetweetHandler() {
		this.listasRetweets = new ArrayList<List<Retweet>>();
	}
	
	// Métodos públicos
	public void observarLista(List<Retweet> lista) {
		this.listasRetweets.add(lista);
	}
	
	public void buscarDesreferenciados() {
		// Esto es muy ineficiente lmao
		this.listasRetweets.stream().forEach(listaR -> {
			listaR.stream().forEach(retu -> {
				System.out.println(retu);
				if (!retu.existeReferencia())
					listaR.remove(retu);
				System.out.println("Borrado");
			});
		});
	}
}
