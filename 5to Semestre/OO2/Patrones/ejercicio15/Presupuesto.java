package unlp.oo2.patrones.ej15;

import java.time.LocalDate;

public class Presupuesto {
    private String nombreSolicitante;
    private LocalDate fechaRealizacion;
    private Equipo equipo;

    //
    
    public Presupuesto(String nombreSolicitante, LocalDate fechaRealizacion, Equipo equipo) {
        this.nombreSolicitante = nombreSolicitante;
        this.fechaRealizacion = fechaRealizacion;
        this.equipo = equipo;
    }

    // INTERFAZ PÚBLICA
    
    public double calcularPresupuesto() {
        return this.equipo.calcularPrecio();
    }

    public String getNombreSolicitante() {
        return nombreSolicitante;
    }

    public LocalDate getFechaRealizacion() {
        return fechaRealizacion;
    }
}