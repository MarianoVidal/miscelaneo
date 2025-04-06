package unlp.oo2.refactoring;

import java.util.List;

public class Pedido {
	private Cliente cliente;
	private List<Producto> productos;
	private IFormaPago formaPago;
	
	public Pedido(Cliente cliente, List<Producto> productos, IFormaPago formaPago) {
		if (!"efectivo".equals(formaPago)
			&& !"6 cuotas".equals(formaPago)
			&& !"12 cuotas".equals(formaPago)) {
				throw new Error("Forma de pago incorrecta");
		}
		this.cliente = cliente;
		this.productos = productos;
		this.formaPago = formaPago;
	}
	
	public double getCostoTotal() {
		double costoProductos = this.getCostoProductos();
		double extraFormaPago = this.formaPago.calcularValor(costoProductos);
		int clienteAñosDesdeFechaAlta = this.cliente.calcularAñosDesdeFechaAlta();
		double costoTotal = (costoProductos + extraFormaPago) * (clienteAñosDesdeFechaAlta > 5 ? 0.9 : 1);
		
		return costoTotal;
	}
	
	private double getCostoProductos() {
		double suma = this.productos.stream().mapToDouble(p -> p.getPrecio()).sum();
		return suma;
	}
}