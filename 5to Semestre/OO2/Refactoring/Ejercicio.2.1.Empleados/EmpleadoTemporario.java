package unlp.oo2.refactoring;

public class EmpleadoTemporario extends Empleado {
    public double horasTrabajadas = 0;
    public int cantidadHijos = 0;
    // ......
    
    public double sueldo() {
    	return this.sueldoBasico()
    		+	(this.horasTrabajadas * 500) 
    		+	(this.cantidadHijos * 1000);
    }
}