package unlp.oo2.patrones.ej15;

public abstract class EquipoBuilder {
    protected Equipo equipo;
    protected Catalogo catalogo;
    
    //
    
    public EquipoBuilder(Catalogo catalogo) {
        this.equipo = new Equipo();
        this.catalogo = catalogo;
    }

    // INTERFAZ PÚBLICA
    
    public abstract void colocarProcesador();
    public abstract void colocarMemoriaRAM();
    public abstract void colocarDisco();
    public abstract void colocarTarjetaGrafica();
    public abstract void colocarGabinete();

    public Equipo construirEquipo() {
        return this.equipo;
    }
}