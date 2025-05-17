package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class ClienteFisico extends Cliente {
	private String dni;
	//
	// INTERFAZ PÚBLICA
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	@Override
	public double getDescuento(double monto) { 
		return monto; 
	}
}