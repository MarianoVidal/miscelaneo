package unlp.oo2.refactoring;

public class ItemCarrito {
    private Producto producto;
    private int cantidad;
        
    public Producto getProducto() {
        return this.producto;
    }
    
    public int getCantidad() {
        return this.cantidad;
    }

	public double calcularPrecioTotal() {
		return this.producto.getPrecio() * getCantidad();
	}
}