package testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import service.AgendaService;

class TestAgendaService {
	AgendaService service;

	@BeforeEach
	void setUp() throws Exception {
		service=new AgendaService();
		service.agregar("c1@gmail.com", "c1", 20, 22222);
		service.agregar("c2@gmail.com", "c2", 30, 33333);
		service.agregar("c3@gmail.com", "c3", 40, 44444);
		service.agregar("c4@gmail.com", "c4", 50, 55555);
		service.agregar("c5@gmail.com", "c5", 60, 66666);
	}

	@Test
	void testAgregar() {
		assertTrue(service.agregar("c6@gmail.com", "c6", 70, 77777));
		assertFalse(service.agregar("c2@gmail.com", "c2", 20, 22222));
		assertEquals(6, service.contactos().length);
	}
	
	@Test
	void testEliminar() {
		assertFalse(service.eliminar("dddd"));
		assertTrue(service.eliminar("c3@gmail.com"));
	}
	
	@Test
	void testBuscar() {
		assertEquals("c4", service.buscar("c4@gmail.com").getNombre());
	}
	
	@Test
	void testContactos() {
		assertEquals(5, service.contactos().length);
	}

}
