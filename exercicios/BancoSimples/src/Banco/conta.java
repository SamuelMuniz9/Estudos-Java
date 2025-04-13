package Banco;

public class conta {
	
	  private String numero;
	  private String titular;
	  private double saldo;
	  
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	 //para depositar
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " concluido");
        } else {
            System.out.println("Depósito inválido.");
        }
    }
    
    
    
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " concluido");
        } else {
            System.out.println("Valor de saqui inválido ou saldo insuficiente.");
        }
    }
    
 


}
