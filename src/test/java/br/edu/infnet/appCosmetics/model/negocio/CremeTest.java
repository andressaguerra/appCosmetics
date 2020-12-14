package br.edu.infnet.appCosmetics.model.negocio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.appCosmetics.model.exception.EmbalagemInvalidaException;

@SpringBootTest
public class CremeTest {
	
	@Test
	void testInstanciaToString() throws EmbalagemInvalidaException {
		Creme c = new Creme("Vanilla Cream", "Lorem ipsum dolor.", 10);
		
		c.setTipo("Hidratante");
		c.setEmbalagem("Plástico");
		
		assertTrue("Vanilla Cream;Lorem ipsum dolor.;10.0;Hidratante;Plástico".equals(c.toString()));
	}
	
	@Test
	void testCalcularValorVenda() throws EmbalagemInvalidaException {
		Creme c = new Creme("Vanilla Cream", "Lorem ipsum dolor.", 10);
		
		c.setTipo("Hidratante");
		c.setEmbalagem("Plástico");
		
		assertTrue(c.calcularValorVenda() == 20);
	}
	
	@Test
	void testEmbalagemInvalida() {
		Creme c = new Creme("Vanilla Cream", "Lorem ipsum dolor.", 10);
		
		c.setTipo("Hidratante");
		
		try {
			c.setEmbalagem("Cerâmica");
		} catch (EmbalagemInvalidaException e) {
			assertEquals("Embalagem inválida.", e.getMessage());
		}
	}
	
	@Test
	void testObterValorPorCosmetico() throws EmbalagemInvalidaException {
		Creme c = new Creme("Vanilla Cream", "Lorem ipsum dolor.", 10);
		
		c.setTipo("Hidratante");
		c.setEmbalagem("Plástico");
		
		String txt = "Vanilla Cream;20.0\r";
		
		assertEquals(c.obterValorPorCosmetico(), txt);
	}

}
