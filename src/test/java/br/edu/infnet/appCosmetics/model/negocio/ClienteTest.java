package br.edu.infnet.appCosmetics.model.negocio;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ClienteTest {
	
	@Test
	void testInstancia() {
		Cliente c = new Cliente("Andressa", "12345678910", "andressa@email.com");
		
		assertNotNull(c);
	}
	
	@Test
	void testToString() {
		Cliente c = new Cliente("Andressa", "12345678910", "andressa@email.com");
		
		assertTrue("Andressa;12345678910;andressa@email.com".equals(c.toString()));	
	}
	
	@Test
	void testGetters() {
		Cliente c = new Cliente("Andressa", "12345678910", "andressa@email.com");
		
		assertTrue("Andressa".equals(c.getNome()));
		assertTrue("12345678910".equals(c.getCpf()));
		assertTrue("andressa@email.com".equals(c.getEmail()));
	}

}
