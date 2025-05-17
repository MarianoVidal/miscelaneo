package ar.edu.unlp.info.oo2.facturacion_llamadas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpresaTest {
	Empresa sistema;

	@BeforeEach
	public void setUp() {
		this.sistema = new Empresa();
		this.sistema.guia.agregarNumeroTelefono("2214444554");
		this.sistema.guia.agregarNumeroTelefono("2214444555");
		this.sistema.guia.agregarNumeroTelefono("2214444556");
		this.sistema.guia.agregarNumeroTelefono("2214444557");
		this.sistema.guia.agregarNumeroTelefono("2214444558");
		this.sistema.guia.agregarNumeroTelefono("2214444559");
	}

	@Test
	void testcalcularMontoTotalLlamadas() {
		Cliente emisorPersonaFisca = sistema.registrarUsuario("11555666", "Brendan Eich" , new ConstructorClienteFisico());
		Cliente remitentePersonaFisica = sistema.registrarUsuario("00000001", "Doug Lea" , new ConstructorClienteFisico());
		Cliente emisorPersonaJuridica = sistema.registrarUsuario("17555222", "Nvidia Corp" , new ConstructorClienteJuridico());
		Cliente remitentePersonaJuridica = sistema.registrarUsuario("25765432", "Sun Microsystems" , new ConstructorClienteJuridico());

		this.sistema.registrarLlamada(emisorPersonaJuridica, remitentePersonaFisica, 10, new ConstructorLlamadaNacional());
		this.sistema.registrarLlamada(emisorPersonaJuridica, remitentePersonaFisica, 8, new ConstructorLlamadaInternacional());
		this.sistema.registrarLlamada(emisorPersonaJuridica, remitentePersonaJuridica, 5, new ConstructorLlamadaNacional());
		this.sistema.registrarLlamada(emisorPersonaJuridica, remitentePersonaJuridica, 7, new ConstructorLlamadaInternacional());
		this.sistema.registrarLlamada(emisorPersonaFisca, remitentePersonaFisica, 15, new ConstructorLlamadaNacional());
		this.sistema.registrarLlamada(emisorPersonaFisca, remitentePersonaFisica, 45, new ConstructorLlamadaInternacional());
		this.sistema.registrarLlamada(emisorPersonaFisca, remitentePersonaJuridica, 13, new ConstructorLlamadaNacional());
		this.sistema.registrarLlamada(emisorPersonaFisca, remitentePersonaJuridica, 17, new ConstructorLlamadaInternacional());

		assertEquals(11454.64, this.sistema.calcularMontoTotalLlamadas(emisorPersonaFisca), 0.01);
		assertEquals(2445.40, this.sistema.calcularMontoTotalLlamadas(emisorPersonaJuridica), 0.01);
		assertEquals(0, this.sistema.calcularMontoTotalLlamadas(remitentePersonaFisica));
		assertEquals(0, this.sistema.calcularMontoTotalLlamadas(remitentePersonaJuridica));
	}

	@Test
	void testAgregarUsuario() {
		assertEquals(this.sistema.cantidadDeUsuarios(), 0);
		this.sistema.guia.agregarNumeroTelefono("2214444558"); 
		Cliente nuevaPersona = this.sistema.registrarUsuario("2444555","Alan Turing", new ConstructorClienteFisico());

		assertEquals(1, this.sistema.cantidadDeUsuarios());
		assertTrue(this.sistema.existeUsuario(nuevaPersona));
	}

	@Test
	void obtenerNumeroLibre() {
		// por defecto es el ultimo
		assertEquals("2214444559", this.sistema.obtenerNumeroLibre());

		this.sistema.getGestorNumeros().cambiarGenerador(new GeneradorPrimero());
		assertEquals("2214444554", this.sistema.obtenerNumeroLibre());

		this.sistema.getGestorNumeros().cambiarGenerador(new GeneradorRandom());
		assertNotNull(this.sistema.obtenerNumeroLibre());
	}
}
