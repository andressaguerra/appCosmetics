package br.edu.infnet.appCosmetics.model.negocio;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CosmeticoTest {
	
	@Test
	void testCreme() {
		Creme c = new Creme("Vanilla Cream", "Lorem ipsum dolor.", 10);
		
		assertNotNull(c);
	}
	
	@Test
	void testPerfume() {
		Perfume p = new Perfume("Vanilla Scent", "Lorem ipsum dolor.", 10);
		
		assertNotNull(p);
	}
	
	@Test
	void testSabonete() {
		Sabonete s = new Sabonete("Vanilla Soap", "Lorem ipsum dolor.", 10);
		
		assertNotNull(s);
	}
}
