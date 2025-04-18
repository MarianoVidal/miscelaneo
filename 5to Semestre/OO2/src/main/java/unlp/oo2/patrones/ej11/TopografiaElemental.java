package unlp.oo2.patrones.ej11;

import java.util.List;

public abstract class TopografiaElemental extends Topografia {
	
	public boolean esUnCompuesto() { return false; }
	public boolean equals(Topografia t) { return this.calcularProporcionAgua() == t.calcularProporcionAgua(); }
	public List<Topografia> getComponentes() { return null; }
}