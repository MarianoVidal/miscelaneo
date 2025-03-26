package unlp.oo2.refactoring;

public class EmpleadoPlanta extends Empleado {
    public int cantidadHijos = 0;
    // ......
    
    public double sueldo() {
        return this.sueldoBasico()
        		+ (this.cantidadHijos * 2000);
    }
}