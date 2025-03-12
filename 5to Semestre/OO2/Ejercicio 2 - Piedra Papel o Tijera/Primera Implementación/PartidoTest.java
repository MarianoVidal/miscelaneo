package unlp.oo2.ejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class PartidaTest {
	
	Papel papel;
	Piedra piedra;
	Tijera tijera;
	
	Partida partida;
	
	@BeforeEach
	void setUp() throws Exception {
		papel = new Papel();
		piedra = new Piedra();
		tijera = new Tijera();
		
		partida = new Partida();
	}
	
    @Test
    public void test_empates() {
        assertEquals("Hay empate", partida.jugarPartida(piedra, piedra));
        assertEquals("Hay empate", partida.jugarPartida(papel, papel));
        assertEquals("Hay empate", partida.jugarPartida(tijera, tijera));
    }
    
    @Test
    public void test_partidas_restantes() {
        assertEquals("La piedra aplasta la tijera", partida.jugarPartida(piedra, tijera));
        assertEquals("La tijera corta el papel", partida.jugarPartida(tijera, papel));
        assertEquals("El papel envuelve la piedra", partida.jugarPartida(papel, piedra));
    }
}
