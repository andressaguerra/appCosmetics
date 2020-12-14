package br.edu.infnet.appCosmetics.model.leitura;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ArquivoLeituraTeste {
	
	@Test
	void testArquivoLeitura() {
		ArquivoLeitura.main(new String[] {"Migração realizada com sucesso."});
	}
}
