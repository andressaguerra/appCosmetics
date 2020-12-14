package br.edu.infnet.appCosmetics.model.negocio;

public class Cliente {
	
	private String nome;
	private String cpf;
	private String email;
	
	public Cliente(String nome, String cpf, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(this.nome);
		sb.append(";");
		sb.append(this.cpf);
		sb.append(";");
		sb.append(this.email);
		
		return sb.toString();
	}
	
	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}
	
	public String getEmail() {
		return email;
	}
	
}
