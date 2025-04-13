package Loja;

public class principal {

	public static void main(String[] args) {
		produto produto = new produto("Mouse Gamer", 129.90, 10);
		
		System.out.println("Antes da venda:");
		produto.exibirInformacoes();

		System.out.println("\nTentando vender 3 unidades...");
		produto.vender(3);

		System.out.println("\nDepois da venda:");
		produto.exibirInformacoes();
	}
	

}
