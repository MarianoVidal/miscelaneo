package unlp.oo2.patrones.ej13;

public class SandwichVegetarianoBuilder extends SandwichBuilder {
	//
	public SandwichVegetarianoBuilder() {
		super();
	}
	
	// INTERFAZ PÚBLICA
	
	public void colocarPan() {
		this.agregarComponenteSandwich(new ComponentePanConSemillas());
	}
	public void colocarAderezo() {
		// No lleva aderezo
	}
	public void colocarPrincipal() {
		this.agregarComponenteSandwich(new ComponenteProvoletaGrillada());
	}
	public void colocarAdicional() {
		this.agregarComponenteSandwich(new ComponenteBerenjenasEscabeche());
	}
}