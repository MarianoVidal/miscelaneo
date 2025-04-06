package unlp.oo2.patrones.ej4;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ToDoItem {
        private String name;
        private Estado estado;
        private LocalDate tiempoInicial;
        private LocalDate tiempoFinal;
        private List<String> comentarios;

        // El objeto recien creado arranca con el estado 'PENDING'
        public ToDoItem(String name) {
                this.name = name;
                this.estado = estado.PENDING;
                this.tiempoInicial = LocalDate.now();
                this.comentarios = new ArrayList<String>();
        }

        // Pasa el ToDoItem a in-progress, siempre y cuando su estado actual sea pending. 
        // Si se encuentra en otro estado, no hace nada.
        public void start() {
                if (this.estado == estado.PENDING)
                        this.estado = estado.IN_PROGRESS;
        }

        /**
        * Pasa el ToDoItem a paused si su estado es in-progress, o a in-progress si su
        * estado es paused. Caso contrario (pending o finished) genera un error
        * informando la causa específica del mismo.
        */
        public void togglePause() {
                switch (this.estado) {
                        case IN_PROGRESS:
                                this.estado = estado.PAUSED;
                                break;
                        case PAUSED:
                                this.estado = estado.IN_PROGRESS;
                                break;
                        default:
                                throw new RuntimeException("El estado del objeto debe ser IN_PROGRESS o PAUSED");
                }
        }


        /**
        * Pasa el ToDoItem a finished, siempre y cuando su estado actual sea 
        * in-progress o paused. Si se encuentra en otro estado, no hace nada.
        */
        public void finish() {
                if (this.estado == estado.IN_PROGRESS || this.estado == estado.PAUSED) {
                        this.estado = estado.FINISHED;
                        this.tiempoFinal = LocalDate.now();
                }
        }


        /**
        * Retorna el tiempo que transcurrió desde que se inició el ToDoItem (start)
        * hasta que se finalizó. En caso de que no esté finalizado, el tiempo que
        * haya transcurrido hasta el momento actual. Si el ToDoItem no se inició,
        * genera un error informando la causa específica del mismo.
        */
        public Duration workedTime() {
                if (this.tiempoInicial == null)
                        throw new RuntimeException("El objeto no está inicializado");

                if (this.tiempoFinal == null)
                        this.tiempoFinal = LocalDate.now();
                Duration duracion = Duration.between(this.tiempoInicial, this.tiempoFinal);
                return duracion;
        }


        /**
        * Agrega un comentario al ToDoItem siempre y cuando no haya finalizado. Caso
        * contrario no hace nada."
        */
        public void addComment(String comment) {
                if (this.estado != estado.FINISHED)
                        comentarios.add(comment);
        }
}
