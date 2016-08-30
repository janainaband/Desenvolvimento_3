package br.aeso.aula03.exercicio01;

import java.util.List;

public class Blog {
	
	private String dataCriacao;
	private String titulo;
	private UsuarioBlog dono;
	private List<Conteudo> conteudo;
	
	
	public Blog(String dataCriacao, String titulo, UsuarioBlog dono, List<Conteudo> conteudo) {
		super();
		this.dataCriacao = dataCriacao;
		this.titulo = titulo;
		this.dono = dono;
		this.conteudo = conteudo;
	}


	public String getDataCriacao() {
		return dataCriacao;
	}


	public void setDataCriacao(String dataCriacao) {
		this.dataCriacao = dataCriacao;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public UsuarioBlog getDono() {
		return dono;
	}


	public void setDono(UsuarioBlog dono) {
		this.dono = dono;
	}


	public List<Conteudo> getConteudo() {
		return conteudo;
	}


	public void setConteudo(List<Conteudo> conteudo) {
		this.conteudo = conteudo;
	}


	public void criarNota() {
		
	}
	
	public void exibirConteudo(){
		
	}
	
	public void comentar(){
		
	}
	
	public void lerComentarios(Conteudo Conteudo[]){
		
	
	}
	
	public void removerConteudo(){
		
	}
	
	public void lerNotas(){
		
	}
	
	
	

}
