package br.edu.infnet.appCosmetics.model.negocio;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class VendaTest {
	
	@Test
	void testAssociacao() {
		Cliente c = new Cliente("Andressa", "12345678910", "andressa@email.com");
		
		Venda v = new Venda();
		v.setCliente(c);
		
		assertTrue(c.equals(v.getCliente()));		
	}
	
	@Test
	void testWeb() {
		Cliente c = new Cliente("Andressa", "12345678910", "andressa@email.com");
		
		Venda v = new Venda();
		v.setCliente(c);
		
		assertTrue(v.isWeb());
	}
	
	@Test
	void testLoja() {
		Cliente c = new Cliente("Andressa", "12345678910", "andressa@email.com");
		
		Venda v = new Venda();
		v.setCliente(c);
		v.setWeb(Boolean.FALSE);
		
		assertFalse(v.isWeb());
	}
	
	@Test
	void testToString() {
		Cliente c = new Cliente("Andressa", "12345678910", "andressa@email.com");
		
		Venda v = new Venda();
		v.setCliente(c);
		v.setWeb(Boolean.TRUE);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime data = LocalDateTime.now();
		
		String s = data.format(formatter)+";true;Andressa;12345678910;andressa@email.com";
		
		assertTrue(s.equals(v.toString()));		
	}

}
