package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class ConstructorClienteJuridico implements IConstructorCliente {
	private ClienteJuridico cliente;
	//
	public ConstructorClienteJuridico() {
		this.cliente = new ClienteJuridico();
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
		this.cliente.setCuit(identificador);
	}

	@Override
	public Cliente construirCliente() {
		return this.cliente;
	}
}