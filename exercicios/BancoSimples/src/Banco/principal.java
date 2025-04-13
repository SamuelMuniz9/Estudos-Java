package Banco;

public class principal {

	public static void main(String[] args) {
		conta conta = new conta();
		conta.setNumero("65646-9");
		conta.setTitular("SamuelMuniz");
		
		System.out.println(conta.getNumero());
		System.out.println(conta.getTitular());
		System.out.println(); //pular linha

		
	    conta.depositar(500);
        System.out.println("Saldo atual: R$ " + conta.getSaldo());
		System.out.println(); //Pular linha
        conta.sacar(200);
        System.out.println("Saldo atual: R$ " + conta.getSaldo());

	}

}
