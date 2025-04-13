package Cadastro;

public class Aluno {
	private String nome;
	private String matricula; 
	private Double nota;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public Double getNota() {
		return nota;
	}
	public void setNota(Double nota) {
		this.nota = nota;
	} 
	
	
	public void exibirInformacoes() {
		System.out.println("Nome:" + getNome());
		System.out.println("Matricula: " + getMatricula());
		System.out.println("Nota:  " + getNota());
		
	}
	
	
	
	
	
	
}
