package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta {

	public String getTipo() {

		return "Conta Corrente";

	}
	
	@Override
	public void sacar(double valor) {
		if (saldo >= valor) {
			this.saldo -= (valor + 0.10);
			System.out.println("Saldo atual: " + saldo);
		} else {
			System.out.println("Saldo insuficiente.");

		}
		
		
	}

}
