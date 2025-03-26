package unlp.oo2.refactoring;

public class Direccion {
	public String localidad;
	public String calle;
	public String numero;
	public String departamento;
	
	public String getLocalidad() {
		return localidad;
	}
	public String getCalle() {
		return calle;
	}
	public String getNumero() {
		return numero;
	}
	public String getDepartamento() {
		return departamento;
	}
	
	@Override
	public String toString() {
		return this.localidad + ", " 
				+ this.calle + ", "
				+ this.numero + ", " 
				+ this.departamento;
	}
}