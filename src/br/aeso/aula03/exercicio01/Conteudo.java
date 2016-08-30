package br.aeso.aula03.exercicio01;

public class Conteudo {
	
	private String dataCriacao;
	private String texto;
	private UsuarioBlog autor;
	
	public Conteudo(String dataCriacao, String texto, UsuarioBlog autor) {
		this.dataCriacao = dataCriacao;
		this.texto = texto;
		this.autor = autor;
	}

	public String getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(String dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public UsuarioBlog getAutor() {
		return autor;
	}

	public void setAutor(UsuarioBlog autor) {
		this.autor = autor;
	}
	public void exibirConteudo(Conteudo comteudo){
	
		
	}	
}
