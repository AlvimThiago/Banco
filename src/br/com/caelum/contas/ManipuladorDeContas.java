package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Cliente;
import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeContas {
	private Conta conta;

	public void transfere(Evento e){
		Conta destino = (Conta) e.getSelecionadoNoCombo("destino");
		conta.transfere(e.getDouble("valorTransferencia"), destino);
	}
	
	public void criaConta(Evento e) {
		String tipo = e.getSelecionadoNoRadio("tipo");
		if (tipo.equals("Conta Corrente")) {
			this.conta = new ContaCorrente();
		} else {
			if (tipo.equals("Conta Poupança")) {
				this.conta = new ContaPoupanca();
			}
		}
		Cliente cli = new Cliente();
		this.conta.setTitular(cli);
		this.conta.setNome(e.getString("titular"));
		this.conta.setAgencia(e.getString("agencia"));
		this.conta.setNumero(e.getInt("numero"));
		//this.conta.setNome("Batman");
		this.conta.depositar(10);
	}

	public void saca(Evento e) {
		double valor = e.getDouble("valorOperacao");
		this.conta.sacar(valor);
		

	}

	public void deposita(Evento e) {

		double valor = e.getDouble("valorOperacao");
		this.conta.depositar(valor);

	}

}
