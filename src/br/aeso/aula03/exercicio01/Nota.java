package br.aeso.aula03.exercicio01;

import java.util.List;

public class Nota extends Conteudo{
	
	private List<Comentario> comentario;

	public Nota(String dataCriacao, String texto, UsuarioBlog autor, List<Comentario> comentario) {
		super(dataCriacao, texto, autor);
		this.setComentario(comentario);
	}

	public List<Comentario> getComentario() {
		return comentario;
	}

	public void setComentario(List<Comentario> comentario) {
		this.comentario = comentario;
	}
	
	
}

	