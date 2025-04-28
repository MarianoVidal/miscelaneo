package unlp.oo2.patrones.ej15;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Catalogo {
    private List<Componente> componentes;
    //
    public Catalogo() {
        this.componentes = new ArrayList<>();
    }

    // INTERFAZ PÚBLICA
    
    public Componente getComponente(String descripcion) {
        Componente encontrado = this.componentes.stream()
                                    .filter(c -> c.getDescripcion().equals(descripcion))
                                    .findFirst()
                                    .orElse(null);
        
        return encontrado; // Retorna null si no se encuentra
    }
    
	public void agregarComponente(Componente c) {
		if (!this.componentes.contains(c) && !this.equals(c) && c != null)
			this.componentes.add(c);
	}
	
	public void quitarComponente(Componente c) {
		if (this.componentes.contains(c))
			this.componentes.remove(c);
	}
}