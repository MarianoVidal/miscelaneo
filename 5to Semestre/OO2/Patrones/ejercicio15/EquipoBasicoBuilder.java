package unlp.oo2.patrones.ej15;

public class EquipoBasicoBuilder extends EquipoBuilder {
	//
	public EquipoBasicoBuilder(Catalogo catalogo) {
		super(catalogo);
	}
	
	// INTERFAZ PÚBLICA
	
    public void colocarProcesador() { 
    	this.equipo.agregarComponente(
    			this.catalogo.getComponente("procesador basico")
    	); 
    }
    public void colocarMemoriaRAM() {
    	this.equipo.agregarComponente(
    			this.catalogo.getComponente("memoria ram 8 gb")
    	); 
    }
    public void colocarDisco() {
    	this.equipo.agregarComponente(
    			this.catalogo.getComponente("disco hdd 500 gb")
    	); 
    }
    public void colocarTarjetaGrafica() {
    	// No hacer nada
    }
    public void colocarGabinete() {
    	this.equipo.agregarComponente(
    			this.catalogo.getComponente("gabinete estandar")
    	); 
    }
}