package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private List<Cliente> clientes = new ArrayList<Cliente>();
	private List<Llamada> llamadas = new ArrayList<Llamada>();
	public GestorNumerosDisponibles guia = new GestorNumerosDisponibles();

	public String obtenerNumeroLibre() {
		return guia.obtenerNumeroLibre();
	}
	
	public boolean agregarNumeroTelefonico(String numero) { 
		return this.guia.agregarNumeroTelefono(numero); 
	}

	public Cliente registrarUsuario(String data, String nombre, IConstructorCliente constructor) {
		constructor.setNombre(nombre);
		constructor.setNumeroTelefono(this.obtenerNumeroLibre());
		constructor.setIdentificador(data);
		Cliente cliente = constructor.construirCliente();
		clientes.add(cliente);
		return cliente;
	}

	public Llamada registrarLlamada(Cliente origen, Cliente destino, int duracion, ConstructorLlamada constructor) {
		constructor.setOrigen(origen);
		constructor.setDestino(destino);
		constructor.setDuracion(duracion);
		Llamada llamada = constructor.construirLlamada();
		llamadas.add(llamada);
		origen.agregarLlamada(llamada);
		return llamada;
	}

	public double calcularMontoTotalLlamadas(Cliente cliente) {
		double c = cliente.getLlamadas().stream()
										.mapToDouble(l -> cliente.getDescuento(l.calcularMonto()))
										.sum();
		
		return c;
	}

	public int cantidadDeUsuarios() {
		return clientes.size();
	}

	public boolean existeUsuario(Cliente persona) {
		return clientes.contains(persona);
	}

	public GestorNumerosDisponibles getGestorNumeros() {
		return this.guia;
	}
}
