package unlp.oo2.refactoring;

public class Cliente {
	private Direccion direccion;
	
	public String getDireccionFormateada() {
		return this.direccion.toString();
	}
}