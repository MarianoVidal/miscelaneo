package unlp.oo2.patrones.ej4;

public class InProgressItem extends EstadoItem {
    public void start(ToDoItem context) {
    	context.cambiarEstado(new PausedItem());
    }
    
    public void togglePause(ToDoItem context) {
    	context.cambiarEstado(new FinishedItem());
    }

    public void addComment(ToDoItem context, String comment) {
    	context.getComentarios().add(comment);
    }
}