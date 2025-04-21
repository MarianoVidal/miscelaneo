package unlp.oo2.patrones.ej13;

public class SandwichClasicoBuilder extends SandwichBuilder {
	//
	public SandwichClasicoBuilder() {
		super();
	}
	
	// INTERFAZ PÚBLICA
	
	public void colocarPan() {
		this.agregarComponenteSandwich(new ComponentePanBrioche());
	}
	public void colocarAderezo() {
		this.agregarComponenteSandwich(new ComponenteMayonesa());
	}
	public void colocarPrincipal() {
		this.agregarComponenteSandwich(new ComponenteCarneTernera());
	}
	public void colocarAdicional() {
		this.agregarComponenteSandwich(new ComponenteTomate());
	}
}