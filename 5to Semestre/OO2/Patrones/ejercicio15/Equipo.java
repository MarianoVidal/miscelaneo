package unlp.oo2.patrones.ej15;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
	private List<Componente> componentes;
	final double TASA_IVA = 0.21;
	
	//
	
    public Equipo() {
        this.componentes = new ArrayList<>();
    }

    // INTERFAZ PÚBLICA
    
    public void agregarComponente(Componente c) {
        if (c != null && !this.componentes.contains(c) && !this.equals(c)) {
            this.componentes.add(c);
        }
    }

    public double calcularPrecio() {
        double calculo = this.componentes.stream()
                                .mapToDouble(Componente::getPrecio)
                                .sum();
        
        return (calculo + this.calcularIVA(calculo));
    }

    public double calcularConsumo() {
        double calculo = this.componentes.stream()
                   			.mapToDouble(Componente::getConsumo)
                   			.sum();
        
        return calculo;
    }

    private double calcularIVA(double precioBase) {
        return (precioBase * TASA_IVA);
    }

    public List<Componente> getComponentes() {
        return new ArrayList<>(this.componentes); // Devuelve copia para evitar modificación externa
    }
}