package unlp.oo2.patrones.ej13;

public class Empleado {
	// INTERFAZ PÚBLICA
	public Sandwich pedirSandwichClasico() {
		return this.construirSandwich(new SandwichClasicoBuilder());
	}
	
	public Sandwich pedirSandwichVegetariano() {
		return this.construirSandwich(new SandwichVegetarianoBuilder());
	}
	
	public Sandwich pedirSandwichVegano() {
		return this.construirSandwich(new SandwichVeganoBuilder());
	}
	
	public Sandwich pedirSandwichSinTACC() {
		return this.construirSandwich(new SandwichSinTACCBuilder());
	}
	
	// MÉTODOS PRIVADOS
	private Sandwich construirSandwich(SandwichBuilder constructor) {
		constructor.colocarPan();
		constructor.colocarAderezo();
		constructor.colocarPrincipal();
		constructor.colocarAdicional();
		
		return constructor.obtenerSandwich();
	}
}