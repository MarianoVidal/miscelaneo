package unlp.oo2.patrones.ej15;

public class EquipoIntermedioBuilder extends EquipoBuilder {
	//
	public EquipoIntermedioBuilder(Catalogo catalogo) {
		super(catalogo);
	}
	
	// INTERFAZ PÚBLICA
	
    public void colocarProcesador() { 
    	this.equipo.agregarComponente(
    			this.catalogo.getComponente("procesador intermedio")
    	); 
    }
    public void colocarMemoriaRAM() {
    	this.equipo.agregarComponente(
    			this.catalogo.getComponente("memoria ram 16 gb")
    	); 
    }
    public void colocarDisco() {
    	this.equipo.agregarComponente(
    			this.catalogo.getComponente("disco ssd 500 gb")
    	); 
    }
    public void colocarTarjetaGrafica() {
    	this.equipo.agregarComponente(
    			this.catalogo.getComponente("tarjeta gráfica gtx 1650")
    	); 
    }
    public void colocarGabinete() {
    	this.equipo.agregarComponente(
    			this.catalogo.getComponente("gabinete intermedio")
    	); 
    }
}