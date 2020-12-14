package br.edu.infnet.appCosmetics.model.negocio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.appCosmetics.model.exception.TamanhoInvalidoException;

@SpringBootTest
public class SaboneteTest {
	
	@Test
	void testInstanciaToString() throws TamanhoInvalidoException {
		Sabonete s = new Sabonete("Vanilla Soap", "Lorem ipsum dolor.", 10);
		
		s.setForma("Comum");
		s.setTamanho("Grande");
		
		assertTrue("Vanilla Soap;Lorem ipsum dolor.;10.0;Comum;Grande".equals(s.toString()));
	}
	
	@Test
	void testCalcularValorVenda() throws TamanhoInvalidoException {
		Sabonete s = new Sabonete("Vanilla Soap", "Lorem ipsum dolor.", 10);
		
		s.setForma("Comum");
		s.setTamanho("Grande");
		
		assertTrue(s.calcularValorVenda() == 18);
	}
	
	@Test
	void testTamanhoInvalido() {
		Sabonete s = new Sabonete("Vanilla Soap", "Lorem ipsum dolor.", 10);
		
		s.setForma("Comum");
		try {
			s.setTamanho(null);
		} catch (TamanhoInvalidoException e) {
			assertEquals("Tamanho inválido.", e.getMessage());
		}
	}
	
	@Test
	void testObterValorPorCosmetico() throws TamanhoInvalidoException {
		Sabonete s = new Sabonete("Vanilla Soap", "Lorem ipsum dolor.", 10);
		
		s.setForma("Comum");
		s.setTamanho("Grande");
		
		String txt = "Vanilla Soap;18.0\r";
		
		assertEquals(s.obterValorPorCosmetico(), txt);
	}

}
