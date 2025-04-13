package unlp.oo2.patrones.ej8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class DispositivoTest {
	
	Dispositivo disp;
	CRC16_Calculator crc16;
	CRC32_Calculator crc32;
	WifiConn wifi;
	CuatroGConnAdapter cuatroG;
	CuatroGConnection cuatroGCon;
	
	@BeforeEach
	void setUp() throws Exception {
		crc16 = new CRC16_Calculator();
		crc32 = new CRC32_Calculator();
		wifi = new WifiConn("WIFI");
		cuatroGCon = new CuatroGConnection("4G");
		cuatroG = new CuatroGConnAdapter(cuatroGCon);
	}
	
    @Test
    public void testNombreCompleto() {
        assertEquals("Gosling, James", james.getNombreCompleto());
        assertEquals("van Rossum, Guido", guido.getNombreCompleto());
    }
}
