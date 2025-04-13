package Loja;

public class produto {
	private String nome;
	private double preco;
	private int quantidade;
	

	public produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	public void vender(int quantidadeVendida) {
		if (quantidadeVendida <= this.quantidade) {
			this.quantidade -= quantidadeVendida;
			System.out.println("Venda realizada com sucesso!");
		} else {
			System.out.println("Estoque insuficiente. Venda não realizada.");
		}
	}
	
	public void exibirInformacoes() {
		System.out.println("Produto: " + nome);
		System.out.println("Preço: R$" + preco);
		System.out.println("Quantidade em estoque: " + quantidade);
	}
	
	
}
