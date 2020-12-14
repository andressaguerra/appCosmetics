package br.edu.infnet.appCosmetics.model.negocio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.appCosmetics.model.exception.EmbalagemInvalidaException;

@SpringBootTest
public class PerfumeTest {
	
	@Test
	void testInstanciaToString() throws EmbalagemInvalidaException {
		Perfume p = new Perfume("Vanilla Scent", "Lorem ipsum dolor.", 10);
		
		p.setSpray(true);
		p.setEmbalagem("Vidro");
		
		assertTrue("Vanilla Scent;Lorem ipsum dolor.;10.0;true;Vidro".equals(p.toString()));
	}
	
	@Test
	void testCalcularValorVenda() throws EmbalagemInvalidaException {
		Perfume p = new Perfume("Vanilla Scent", "Lorem ipsum dolor.", 10);
		
		p.setSpray(true);
		p.setEmbalagem("Vidro");
		
		assertTrue(p.calcularValorVenda() == 45);
	}
	
	@Test
	void testEmbalagemInvalida() {
		Perfume p = new Perfume("Vanilla Scent", "Lorem ipsum dolor.", 10);
		
		p.setSpray(true);
		try {
			p.setEmbalagem("Cerâmica");
		} catch (EmbalagemInvalidaException e) {
			assertEquals("Embalagem inválida.", e.getMessage());
		}
	}
	
	@Test
	void testObterValorPorCosmetico() throws EmbalagemInvalidaException {
		Perfume p = new Perfume("Vanilla Scent", "Lorem ipsum dolor.", 10);
		
		p.setSpray(true);
		p.setEmbalagem("Vidro");
		
		String txt = "Vanilla Scent;45.0\r";
		
		assertEquals(p.obterValorPorCosmetico(), txt);
	}

}
