 package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Cliente;
import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeContas {
	private Conta conta;
	
	public void criaConta(Evento e){
		conta = new Conta();
		Cliente cli = new Cliente();
		conta.setTitular(cli);
		conta.setAgencia("1234");
		conta.setNumero(56789);
		conta.setNome("Batman");
		conta.depositar(10);
	}
	
	public void saca(Evento e){
		double valor = e.getDouble("valor");
		this.conta.sacar(valor);
		
	}
	
	public void deposita(Evento e){
		
		double valorDigitado = e.getDouble("valor");
		this.conta.depositar(valorDigitado);
			
		
	}
	


}
