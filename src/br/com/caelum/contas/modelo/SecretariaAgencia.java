package br.com.caelum.contas.modelo;

public class SecretariaAgencia extends Secretaria{
	
	@Override
	public double getBonificacao() {
		
		return this.salario * 1.2 + 200;
	}

}
