package br.com.caelum.contas.modelo;

public class ControleDeBonificacoes {

	private double totalDeBonificacoes = 0;

	public void registra(Funcionario f) {
		this.totalDeBonificacoes += f.getBonificação();

	}

	public double getTotalDeBonificacoes() {
		return totalDeBonificacoes;
	}

}
