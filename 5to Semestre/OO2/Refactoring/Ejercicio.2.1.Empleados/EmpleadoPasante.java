package unlp.oo2.refactoring;

public class EmpleadoPasante extends Empleado {
    // ......
    
    public double sueldo() {
        return this.sueldoBasico();
    }
}