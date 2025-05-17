package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class ConstructorClienteFisico implements IConstructorCliente {
	private ClienteFisico cliente;
	//
	public ConstructorClienteFisico() {
		this.cliente = new ClienteFisico();
	}
	
	// INTERFAZ PÚBLICA
	
	@Override
	public void setNombre(String nombre) {
		this.cliente.setNombre(nombre);
	}

	@Override
	public void setNumeroTelefono(String numero) {
		this.cliente.setNumeroTelefono(numero);
	}

	@Override
	public void setIdentificador(String identificador) {
		this.cliente.setDni(identificador);
	}

	@Override
	public Cliente construirCliente() {
		return this.cliente;
	}
}