package biblioteca;

public class livro {
	private String titulo;
	private String autor;
	private int anoPublicacao;
	
	public void exibirInformacoes() {
	//fazendo isso dentro da propria classe o private continua mantendo o codigo seguro//
	this.titulo = "Pequeno Príncipe";
	this.autor = "Antoine de Saint-Exupéry";
	this.anoPublicacao = 1943;

	System.out.println("Título: " + this.titulo);
	System.out.println("Autor: " + this.autor);
	System.out.println("Ano de Publicação: " + this.anoPublicacao);
	
	}

	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}



}

	