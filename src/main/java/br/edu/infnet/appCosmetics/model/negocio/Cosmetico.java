package br.edu.infnet.appCosmetics.model.negocio;

public abstract class Cosmetico {
	
	private String nome;
	private String descricao;
	private float custo;
	
	public Cosmetico(String nome, String descricao, float custo) {
		this.nome = nome;
		this.descricao = descricao;
		this.custo = custo;
	}
	
	public abstract float calcularValorVenda();
	
	public String obterValorPorCosmetico() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(this.getNome());
		sb.append(";");
		sb.append(this.calcularValorVenda());
		sb.append("\r");
		
		return sb.toString();
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(this.getNome());
		sb.append(";");
		sb.append(this.getDescricao());
		sb.append(";");
		sb.append(this.getCusto());
			
		return sb.toString();
	}
	
	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public float getCusto() {
		return custo;
	}
	
}
