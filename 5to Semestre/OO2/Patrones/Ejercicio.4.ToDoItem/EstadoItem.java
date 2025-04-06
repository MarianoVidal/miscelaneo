package unlp.oo2.patrones.ej4;

import java.time.LocalDate;

public abstract class EstadoItem {
    public abstract void start(ToDoItem context);
    public abstract void togglePause(ToDoItem context);
    
    public LocalDate finish() {
    	return LocalDate.now();
    }
}