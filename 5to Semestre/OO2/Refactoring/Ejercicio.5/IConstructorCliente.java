package ar.edu.unlp.info.oo2.facturacion_llamadas;

public interface IConstructorCliente {
	public void setNombre(String nombre);
	public void setNumeroTelefono(String numero);
	public void setIdentificador(String identificador);
	public Cliente construirCliente();
}