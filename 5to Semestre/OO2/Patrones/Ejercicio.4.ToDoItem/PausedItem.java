package unlp.oo2.patrones.ej4;

public class PausedItem extends EstadoItem {
    public void start(ToDoItem context) {
    	context.cambiarEstado(new InProgressItem());
    }
    
    public void togglePause(ToDoItem context) {
    	context.cambiarEstado(new FinishedItem());
    }
}