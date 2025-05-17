package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class ClienteJuridico extends Cliente {
	private String cuit;
	//
	// INTERFAZ PÚBLICA
	
	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	
	@Override
	public double getDescuento(double monto) { 
		return monto - (monto * 0.15);
	}
}