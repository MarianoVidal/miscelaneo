package unlp.oo2.patrones.ej15;

public class Tecnico {
	private Catalogo catalogo;
	
	//
	
	public Tecnico(Catalogo catalogo) {
		this.catalogo = new Catalogo();
	}
	
	// INTERFAZ PÚBLICA
	
	public Equipo construirPC(EquipoBuilder constructor) {
		constructor.colocarProcesador();
		constructor.colocarMemoriaRAM();
		constructor.colocarDisco();
		constructor.colocarTarjetaGrafica();
		constructor.colocarGabinete();
		
		Equipo equipo = constructor.construirEquipo();
		
		return equipo;
	}
}