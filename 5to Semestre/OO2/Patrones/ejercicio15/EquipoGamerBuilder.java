package unlp.oo2.patrones.ej15;

public class EquipoGamerBuilder extends EquipoBuilder {
	//
	public EquipoGamerBuilder(Catalogo catalogo) {
		super(catalogo);
	}
	
	// INTERFAZ PÚBLICA
	
    public void colocarProcesador() { 
    	this.equipo.agregarComponente(
    			this.catalogo.getComponente("procesador gamer")
    	); 
    }
    public void colocarMemoriaRAM() {
    	this.equipo.agregarComponente(
    			this.catalogo.getComponente("memoria ram 32 gb + 32 gb")
    	); 
    }
    public void colocarDisco() {
    	this.equipo.agregarComponente(
    			this.catalogo.getComponente("disco ssd 500 gb + ssd 1 tb")
    	); 
    }
    public void colocarTarjetaGrafica() {
    	this.equipo.agregarComponente(
    			this.catalogo.getComponente("tarjeta gráfica rtx 4090")
    	); 
    }
    public void colocarGabinete() {
    	this.equipo.agregarComponente(
    			this.catalogo.getComponente("gabinete gamer")
    	); 
    }
}