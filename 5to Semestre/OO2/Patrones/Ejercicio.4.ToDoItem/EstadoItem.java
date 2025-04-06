package unlp.oo2.patrones.ej4;

import java.time.LocalDateTime;

public abstract class EstadoItem {
    public abstract void start(ToDoItem context);
    public abstract void togglePause(ToDoItem context);
    
    public LocalDateTime finish() {
    	return LocalDateTime.now();
    }
    
    public abstract void addComment(ToDoItem context, String comment);
}