package br.edu.infnet.appCosmetics.model.negocio;

import br.edu.infnet.appCosmetics.model.exception.TamanhoInvalidoException;

public class Sabonete extends Cosmetico {

	private String forma;
	private String tamanho;

	public Sabonete(String nome, String descricao, float custo) {
		super(nome, descricao, custo);
	}

	@Override
	public float calcularValorVenda() {
		
		float custoExtra = 0;
		
		if (tamanho.equals("Pequeno")) {
			custoExtra = 2;
		} else if (tamanho.equals("Médio")) {
			custoExtra = 4;
		} else {
			custoExtra = 6;
		}
		
		if (forma.equals("Comum")) {
			custoExtra += 2;
		} else {
			custoExtra += 4;
		}
		
		return custoExtra + this.getCusto();
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(super.toString());
		sb.append(";");
		sb.append(this.getForma());
		sb.append(";");
		sb.append(this.getTamanho());
		
		return sb.toString();
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) throws TamanhoInvalidoException {
		
		if (tamanho == null) {
			throw new TamanhoInvalidoException("Tamanho inválido.");
		}
		
		this.tamanho = tamanho;
	}

}
