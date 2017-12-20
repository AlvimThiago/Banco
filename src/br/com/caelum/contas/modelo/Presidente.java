package br.com.caelum.contas.modelo;

public class Presidente extends Funcionario {

	@Override
	public double getBonificacao() {
		
		return this.salario * 1.6 + 1000;
		
	}
}
