package unlp.oo2.patrones.ej4;

import java.time.LocalDate;

public class FinishedItem extends EstadoItem {
    public void start(ToDoItem context) {
    	throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
    }
    
    public void togglePause(ToDoItem context) {
    	// Nada
    }
    
    public void addComment(ToDoItem context, String comment) {
    	// Nada
    }
}