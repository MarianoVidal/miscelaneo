package unlp.oo2.patrones.ej13;

public class SandwichSinTACCBuilder extends SandwichBuilder {
	//
	public SandwichSinTACCBuilder() {
		super();
	}
	
	// INTERFAZ PÚBLICA
	
	public void colocarPan() {
		this.agregarComponenteSandwich(new ComponentePanDeChipa());
	}
	public void colocarAderezo() {
		this.agregarComponenteSandwich(new ComponenteSalsaTartara());
	}
	public void colocarPrincipal() {
		this.agregarComponenteSandwich(new ComponenteCarnePollo());
	}
	public void colocarAdicional() {
		this.agregarComponenteSandwich(new ComponenteVerdurasGrilladas());
	}
}