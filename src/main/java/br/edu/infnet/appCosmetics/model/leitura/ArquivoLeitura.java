package br.edu.infnet.appCosmetics.model.leitura;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import br.edu.infnet.appCosmetics.model.exception.EmbalagemInvalidaException;
import br.edu.infnet.appCosmetics.model.exception.TamanhoInvalidoException;
import br.edu.infnet.appCosmetics.model.negocio.Creme;
import br.edu.infnet.appCosmetics.model.negocio.Perfume;
import br.edu.infnet.appCosmetics.model.negocio.Sabonete;

public class ArquivoLeitura {
	
	public static void main(String[] args) {
		
		String dir = "C:/dev/workspace/";
		String arq = "vendas.txt";
		
		try {
			FileReader leitura = new FileReader(dir+arq);		
			BufferedReader in = new BufferedReader(leitura);
			
			FileWriter escrita = new FileWriter(dir+"out_"+arq);
			BufferedWriter out = new BufferedWriter(escrita);

			String linha = in.readLine();
			
			while(linha != null) {
				
				String[] campos = linha.split(";");
				
				switch(campos[0].toUpperCase()) {
				case "S":
					Sabonete s = new Sabonete(campos[1], campos[2], Float.valueOf(campos[3]));
					
					s.setForma(campos[4]);
					s.setTamanho(campos[5]);
					
					out.write(s.obterValorPorCosmetico());
					
					break;
					
				case "C":
					Creme c = new Creme(campos[1], campos[2], Float.valueOf(campos[3]));
					
					c.setTipo(campos[4]);
					c.setEmbalagem(campos[5]);
					
					out.write(c.obterValorPorCosmetico());
					
					break;
				
				case "P":
					Perfume p = new Perfume(campos[1], campos[2], Float.valueOf(campos[3]));
					
					p.setSpray(Boolean.valueOf(campos[4]));
					p.setEmbalagem(campos[5]);
					
					out.write(p.obterValorPorCosmetico());
					
					break;
				
				default:
					break;
				}
				
				linha = in.readLine();
			}
			
			in.close();
			leitura.close();
			
			out.close();
			escrita.close();
			
		} catch (IOException | TamanhoInvalidoException | EmbalagemInvalidaException e) {
			System.out.println(e.getMessage());
		}
	}

}
