package unlp.oo2.patrones.ej11;

import java.util.List;

public abstract class Topografia {
	public abstract double calcularProporcionAgua();
	public abstract boolean esUnCompuesto();
	public abstract List<Topografia> getComponentes();
}
