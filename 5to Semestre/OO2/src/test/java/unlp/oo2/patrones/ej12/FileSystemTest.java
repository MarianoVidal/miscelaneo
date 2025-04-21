package unlp.oo2.patrones.ej12;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class FileSystemTest {
	final String ARCHIVO_NOMBRE_1 = "Prueba";
	final String ARCHIVO_NOMBRE_2 = "Papota";
	final String ARCHIVO_NOMBRE_3 = "Pruebona";
	final String ARCHIVO_NOMBRE_4 = "Papota";
	final LocalDate ARCHIVO_FECHA_1 = LocalDate.now();
	final LocalDate ARCHIVO_FECHA_2 = LocalDate.now().plusDays(1);
	final LocalDate ARCHIVO_FECHA_3 = LocalDate.now().plusDays(2);
	final LocalDate ARCHIVO_FECHA_4 = LocalDate.now().plusDays(3);
	final int ARCHIVO_TAMAÑO_1 = 32;
	final int ARCHIVO_TAMAÑO_2 = 32;
	final int ARCHIVO_TAMAÑO_3 = 64;
	final int ARCHIVO_TAMAÑO_4 = 48;
	
	final String DIRECTORIO_NOMBRE_1 = "Test";
	final String DIRECTORIO_NOMBRE_2 = "Testy";
	final String DIRECTORIO_NOMBRE_3 = "Papota";
	final String DIRECTORIO_NOMBRE_4 = "Testeo";
	final LocalDate DIRECTORIO_FECHA_1 = LocalDate.now();
	final LocalDate DIRECTORIO_FECHA_2 = LocalDate.now();
	final LocalDate DIRECTORIO_FECHA_3 = LocalDate.now();
	final LocalDate DIRECTORIO_FECHA_4 = LocalDate.now();
	
	final String TEST_NOMBRE_BUSCADO = "Prueba";
	final String TEST_NOMBRE_BUSCADO_2 = "Papota";
	
	Archivo archivo1, archivo2, archivo3, archivo4;
	Directorio directorio1, directorio2, directorio3, directorio4;
	FileSystem fs;
	
	@BeforeEach
	void setUp() throws Exception {
		archivo1 = new Archivo(ARCHIVO_NOMBRE_1, ARCHIVO_FECHA_1, ARCHIVO_TAMAÑO_1);
		archivo2 = new Archivo(ARCHIVO_NOMBRE_2, ARCHIVO_FECHA_2, ARCHIVO_TAMAÑO_2);
		archivo3 = new Archivo(ARCHIVO_NOMBRE_3, ARCHIVO_FECHA_3, ARCHIVO_TAMAÑO_3);
		archivo4 = new Archivo(ARCHIVO_NOMBRE_4, ARCHIVO_FECHA_4, ARCHIVO_TAMAÑO_4);
		
		directorio1 = new Directorio(DIRECTORIO_NOMBRE_1, DIRECTORIO_FECHA_1);
		directorio2 = new Directorio(DIRECTORIO_NOMBRE_2, DIRECTORIO_FECHA_2);
		directorio3 = new Directorio(DIRECTORIO_NOMBRE_3, DIRECTORIO_FECHA_3);
		directorio4 = new Directorio(DIRECTORIO_NOMBRE_4, DIRECTORIO_FECHA_4);
		
		directorio1.moverUnidad(archivo1);
		
		directorio3.moverUnidad(archivo2);
		directorio3.moverUnidad(archivo3);
		
		directorio2.moverUnidad(directorio3);
		directorio2.moverUnidad(directorio4);
		directorio2.moverUnidad(archivo4);
		
		fs = new FileSystem();
	}
	
	@Test
	public void test_inicializacion() {
		Assertions.assertNull(fs.archivoMasGrande());
		Assertions.assertNull(fs.archivoMasNuevo());
		Assertions.assertTrue(fs.estaVacio());
		Assertions.assertEquals(32, fs.tamanoTotalOcupado());
		Assertions.assertEquals("", fs.listadoDeContenido());
	}
	
	@Test
	public void test_archivo_mas_grande() {
		filesystemSetup();
		Assertions.assertEquals(archivo3, fs.archivoMasGrande());
	}
	
	@Test
	public void test_archivo_mas_nuevo() {
		filesystemSetup();
		Assertions.assertEquals(archivo4, fs.archivoMasNuevo());
	}
	
	@Test
	public void test_buscar() {
		filesystemSetup();
		Assertions.assertEquals(archivo1, fs.buscar(TEST_NOMBRE_BUSCADO));
	}
	
	@Test
	public void test_buscar_todos() {
		filesystemSetup();
		
		List<Unidad> lista = new ArrayList<Unidad>();
		lista.add(archivo2);
		lista.add(directorio3);
		lista.add(archivo4);
		
		Assertions.assertEquals(lista, fs.buscarTodos(TEST_NOMBRE_BUSCADO_2));
	}
	
	@Test
	public void test_tamaño_total_ocupado() {
		filesystemSetup();
		
		int sumatoria = ARCHIVO_TAMAÑO_1 + ARCHIVO_TAMAÑO_2
			+ ARCHIVO_TAMAÑO_3 + ARCHIVO_TAMAÑO_4 + (32 * 5);
		
		Assertions.assertEquals(sumatoria, fs.tamanoTotalOcupado());
	}
	
	@Test
	public void test_listado_de_contenido() {
		filesystemSetup();
		
		String cadena = "//" + DIRECTORIO_NOMBRE_1 + "/" + ARCHIVO_NOMBRE_1 + "\n"
		+ "//" + DIRECTORIO_NOMBRE_2 + "/" + DIRECTORIO_NOMBRE_3 + "/" + ARCHIVO_NOMBRE_2 + "\n"
		+ "//" + DIRECTORIO_NOMBRE_2 + "/" + DIRECTORIO_NOMBRE_3 + "/" + ARCHIVO_NOMBRE_3 + "\n"
		+ "//" + DIRECTORIO_NOMBRE_2 + "/" + DIRECTORIO_NOMBRE_4 + "\n"
		+ "//" + DIRECTORIO_NOMBRE_2 + "/" + ARCHIVO_NOMBRE_4 + "\n";
		
		Assertions.assertEquals(cadena, fs.listadoDeContenido());
	}
	

	private void filesystemSetup() {
		fs.moverUnidad(directorio1);
		fs.moverUnidad(directorio2);
	}
}
