package unlp.oo2.patrones.ej11;

import java.util.ArrayList;
import java.util.List;

public class TopografiaMixta extends Topografia {
	private List<Topografia> componentes;
	
	public TopografiaMixta() {
		// Ya sabemos que la TopografiaMixta va a tener, a lo sumo, 4 elementos
		componentes = new ArrayList<Topografia>();
	}
	
	public double calcularProporcionAgua() {
		double calculo = componentes.stream()
							.mapToDouble(comp -> comp.calcularProporcionAgua())
							.sum() / 4;
		return (this.componentes.size() > 0 ? calculo : 0);
	}
	public boolean equals(Topografia t) {
		boolean condicion = (t.esUnCompuesto() ? 
				this.componentes.equals(t.getComponentes())
				: false);
		return condicion;
	}
	public boolean esUnCompuesto() { return true; }
	public List<Topografia> getComponentes() { return this.componentes; }
	
	public void agregarComponente(Topografia t) {
		if (t.esUnCompuesto()) {
			if (this.siHayUnCompuesto())
				throw new RuntimeException("No puede agregarse mas de un objeto TopografiaMixto");
		}
		
		if (this.componentes.size() > 3)
			throw new RuntimeException("No pueden agregarse mas de 4 objetos");
		
		componentes.add(t);
	}
	
	// No me gusta mucho como plantée este método, PREGUNTAR
	private boolean siHayUnCompuesto() {
		boolean condicion = this.componentes.stream().anyMatch(comp -> comp.esUnCompuesto());
		return condicion;
	}
}