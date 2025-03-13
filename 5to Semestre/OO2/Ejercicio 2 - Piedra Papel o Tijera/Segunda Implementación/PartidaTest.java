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
	Spock spock;
	
	Partida partida;
	
	@BeforeEach
	void setUp() throws Exception {
		papel = new Papel();
		piedra = new Piedra();
		tijera = new Tijera();
		spock = new Spock();
	}
	
    @Test
    public void test_empates() {
    	partida = new Partida(piedra, piedra);
        assertEquals("Hay empate", partida.jugar());
        
    	partida = new Partida(papel, papel);
        assertEquals("Hay empate", partida.jugar());
        
        partida = new Partida(tijera, tijera);
        assertEquals("Hay empate", partida.jugar());
    }
    
    @Test
    public void test_partidas_restantes() {
    	partida = new Partida(papel, piedra);
        assertEquals("Papel ganó contra Piedra", partida.jugar());
        
    	partida = new Partida(tijera, piedra);
        assertEquals("Tijera perdió contra Piedra", partida.jugar());
        
    	partida = new Partida(tijera, spock);
        assertEquals("Tijera perdió contra Spock", partida.jugar());
    }
}
