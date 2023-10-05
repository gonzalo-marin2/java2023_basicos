package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import service.AgendaService;
import model.Contacto;

class TestAgendaService {
	static AgendaService service=new AgendaService();
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		//service.agregar("lo@mail.com", "Lolo", 357, 58);
		//service.agregar("paul@mail.com", "Pablo", 123, 32);
		//service.agregar("mary@mail.com", "María", 903, 19);	
	}

	@Test
	void testAgregar() {
		service.agregar("mar@mail.com", "Mar", 839, 48);
		assertEquals(true, service.buscar("mar@mail.com"));
	}
	
	@Test
	void testEliminar() {
		service.eliminar("mar@mail.com");
		assertEquals(true, service.buscar("mar@mail.com"));
	}
	
	@Test
	void testBuscar() {
		service.buscar("lo@mail.com");
		assertEquals("Lolo", service.buscar("lo@mail.com"));
	}
	
	@Test
	void contactos() {
		
	}

}
