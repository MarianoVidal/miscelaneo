package unlp.oo2.patrones.ej12;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArchivoTest {
	final String ARCHIVO_NOMBRE = "Prueba";
	final LocalDate ARCHIVO_FECHA = LocalDate.now();
	final int ARCHIVO_TAMAÑO = 32;
	
	Archivo archivo1;
	
	@BeforeEach
	void setUp() throws Exception {
		archivo1 = new Archivo(ARCHIVO_NOMBRE, ARCHIVO_FECHA, ARCHIVO_TAMAÑO);
	}
	
	@Test
	public void test_inicializacion() {
		Assertions.assertEquals(ARCHIVO_NOMBRE, archivo1.getNombre());
		Assertions.assertEquals(ARCHIVO_FECHA, archivo1.getFechaCreacion());
		Assertions.assertEquals(ARCHIVO_TAMAÑO, archivo1.getTamañoEnBytes());
	}
}
