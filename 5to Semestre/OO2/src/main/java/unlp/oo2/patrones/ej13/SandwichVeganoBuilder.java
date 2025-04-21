package unlp.oo2.patrones.ej13;

public class SandwichVeganoBuilder extends SandwichBuilder {
	//
	public SandwichVeganoBuilder() {
		super();
	}
	
	// INTERFAZ PÚBLICA
	
	public void colocarPan() {
		this.agregarComponenteSandwich(new ComponentePanIntegral());
	}
	public void colocarAderezo() {
		this.agregarComponenteSandwich(new ComponenteSalsaCriolla());
	}
	public void colocarPrincipal() {
		this.agregarComponenteSandwich(new ComponenteMilanesaGirgolas());
	}
	public void colocarAdicional() {
		// No lleva adicional
	}
}