package unlp.oo2.patrones.ej15;

public class Componente {
    private String nombre;
    private String descripcion;
    private double precio;
    private double consumo;
    
    //

    public Componente(String nombre, String descripcion, double precio, double consumo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.consumo = consumo;
    }
    
    // INTERFAZ PÚBLICA

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public double getConsumo() {
        return consumo;
    }
}