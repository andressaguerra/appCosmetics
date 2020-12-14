package br.edu.infnet.appCosmetics.model.negocio;

import java.util.Arrays;

import br.edu.infnet.appCosmetics.model.exception.EmbalagemInvalidaException;

public class Perfume extends Cosmetico {
	
	private boolean spray;
	private String embalagem;	

	public Perfume(String nome, String descricao, float custo) {
		super(nome, descricao, custo);
	}

	@Override
	public float calcularValorVenda() {
		
		float custoEmbalagem = 0;
		
		switch (embalagem) {
		case "Vidro":
			custoEmbalagem = 30;
			break;
			
		case "Alumínio":
			custoEmbalagem = 20;
			break;
		
			
		case "Plástico":
			custoEmbalagem = 10;
			break;
		}
		
		if(spray) {
			custoEmbalagem += 5;
		}
		
		return custoEmbalagem + this.getCusto();
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(super.toString());
		sb.append(";");
		sb.append(this.isSpray());
		sb.append(";");
		sb.append(this.getEmbalagem());
		
		return sb.toString();
	}

	public boolean isSpray() {
		return spray;
	}

	public void setSpray(boolean spray) {
		this.spray = spray;
	}

	public String getEmbalagem() {
		return embalagem;
	}

	public void setEmbalagem(String embalagem) throws EmbalagemInvalidaException {
		
		if (!Arrays.asList("Vidro", "Alumínio", "Plástico").contains(embalagem)) {
			throw new EmbalagemInvalidaException("Embalagem inválida.");
		}
		
		this.embalagem = embalagem;
	}

}
