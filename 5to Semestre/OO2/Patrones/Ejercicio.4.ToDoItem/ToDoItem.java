package unlp.oo2.patrones.ej4;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ToDoItem {
        private String name;
        private EstadoItem estado;
        private LocalDate tiempoInicial;
        private LocalDate tiempoFinal;
        private List<String> comentarios;

        // El objeto recien creado arranca con el estado 'PENDING'
        public ToDoItem(String name) {
        	this.estado = new PendingItem();
            this.tiempoInicial = LocalDate.now();
            this.comentarios = new ArrayList<String>();
        }

        public void start() {
        	this.estado.start(this);
        }

        public void togglePause() {
        	this.estado.togglePause(this);
        }

        public void finish() {
        	if (estado == null)
        		throw new RuntimeException("El objeto ToDoItem no se inicializó");
        	
        	this.tiempoFinal = this.estado.finish();
        }


        public Duration workedTime() {
        	return Duration.between(tiempoInicial, tiempoFinal);
        }


        public void addComment(String comment) {
        	this.comentarios.add(comment);
        }
        
        // Parte del patrón State
        public void cambiarEstado(EstadoItem nuevoEstado) {
        	this.estado = nuevoEstado;
        }
}