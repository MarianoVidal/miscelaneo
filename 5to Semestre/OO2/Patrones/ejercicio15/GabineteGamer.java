package unlp.oo2.patrones.ej15;

import java.util.List;
import java.util.ArrayList;

public class GabineteGamer extends Componente implements IGabinete {
	private List<Componente> componentes;
	//
	public GabineteGamer(double precio) { 
		super("gabinete gamer", "gabinete gamer", precio, 0);
		this.componentes = new ArrayList<Componente>();
	}
	
	// INTERFAZ PÚBLICA
	
	public void agregarComponente(Componente c) {
		if (!this.componentes.contains(c) && !this.equals(c) && c != null)
			this.componentes.add(c);
	}
	
	public void quitarComponente(Componente c) {
		if (this.componentes.contains(c))
			this.componentes.remove(c);
	}
	
	public double obtenerConsumoComponentes() { 
		double calculo = this.componentes.stream()
							.mapToDouble(c -> c.getConsumo())
							.sum();
		
		return calculo;
	}
	
	@Override
	public double getConsumo() {
		return this.obtenerConsumoComponentes() + (this.obtenerConsumoComponentes() * 0.5);
	}
	
	public String obtenerFuente() { return "fuente" + this.getConsumo() + "w"; }
}