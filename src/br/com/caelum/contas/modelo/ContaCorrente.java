package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta implements Tributavel {

	public String getTipo() {

		return "Conta Corrente";

	}
	
	@Override
	public void sacar(double valor) {

		if (valor < 0) {
			throw new IllegalArgumentException("Voce tentou sacar"
					+ " um valor negativo");
		} else {

			if (this.saldo >= valor) {
				this.saldo = this.saldo - valor + 0.1;
				System.out.println("Saldo atual: " + saldo);
			} else {
				throw new SaldoInsuficienteException(valor);

			}
		}
	}

	@Override
	public double getValorImposto() {
		
		return this.getSaldo() * 0.01;
	}
	
	



}


