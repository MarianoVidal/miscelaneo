package unlp.oo2.refactoring;

public abstract class Empleado {
    protected String nombre;
    protected String apellido;
    protected double sueldoBasico = 0;
    
    public abstract double sueldo();
    
    protected double sueldoBasico() {
    	return this.sueldoBasico - (this.sueldoBasico * 0.13);
    }
}
