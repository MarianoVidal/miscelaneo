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
		
		String cadena =""
				+"["
				+"\n	{"
				+"\n		\"nombre\": \""+socio1.getNombre()+"\","
				+"\n		\"email\": \""+socio1.getEmail()+"\","
				+"\n		\"legajo\": \""+socio1.getLegajo()+"\""
				+"\n	},"
				+"\n	{"
				+"\n		\"nombre\": \""+socio2.getNombre()+"\","
				+"\n		\"email\": \""+socio2.getEmail()+"\","
				+"\n		\"legajo\": \""+socio2.getLegajo()+"\""
				+"\n	}"
				+"\n]"
				+"";
		
		Assertions.assertEquals(cadena, biblioteca.exportarSocios());
	}
}