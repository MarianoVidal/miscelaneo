package ar.edu.unlp.info.oo2.biblioteca;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BibliotecaTest {
	Biblioteca biblioteca;
	Socio socio1;
	Socio socio2;
	
	@BeforeEach
	void setUp() throws Exception {
		biblioteca = new Biblioteca();
		
		socio1 = new Socio("Arya Stark", "needle@stark.com", "5234-5");
		socio2 = new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2");
	}
	
	@Test
	public void test_inicializacion() {
		// La lista se creó correctamente
		Assertions.assertTrue(biblioteca.exportarSocios().equals("[]"));
		
		// El objeto VoorheesExporter se creó correctamente
		Assertions.assertFalse(biblioteca.getExporter().equals(null));
	}
	
	@Test
	public void test_exportar_socios() {
		//Se imprime correctamente la información de los dos socios
		biblioteca.agregarSocio(socio1);
		biblioteca.agregarSocio(socio2);
		
		List<Socio> listaPrueba = new ArrayList<Socio>();
		listaPrueba.add(socio1);
		listaPrueba.add(socio2);
		
		Assertions.assertEquals(biblioteca.exportarSocios(), this.exportar(listaPrueba));
	}
	
	// Copié y pegué los mismos metodos pq yolo
	private String exportar(Socio socio) {
		String separator = System.lineSeparator();
		return "\t{" + separator
			+ "\t\t\"nombre\": \"" + socio.getNombre() + "\"," + separator
			+ "\t\t\"email\": \"" + socio.getEmail() + "\"," + separator
			+ "\t\t\"legajo\": \"" + socio.getLegajo() + "\"" + separator
			+ "\t}";
	}

	public String exportar(List<Socio> socios) {
		String separator = System.lineSeparator();
		StringBuilder buffer = new StringBuilder("[" + separator);
		socios.forEach(socio -> {
			buffer.append(this.exportar(socio))
				.append(",")
				.append(separator);
		});
		
		// remueve la última coma y fin de línea
		buffer.setLength(buffer.length() - (separator.length() + 1));
		buffer.append(separator).append("]");
		return buffer.toString();
	}
}
