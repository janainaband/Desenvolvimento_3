package br.aeso.aula03.exercicio01;

public class UsuarioBlog {
	
	private String email;
	private String nome;
	
	public UsuarioBlog(String email, String nome) {
		this.email = email;
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}