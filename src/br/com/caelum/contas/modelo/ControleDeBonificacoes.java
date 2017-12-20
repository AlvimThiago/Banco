package br.com.caelum.contas.modelo;

public class ControleDeBonificacoes {

	private double totalDeBonificacoes = 0;

	public void registra(Funcionario f) {
		
		System.out.println("Adicionado bonificação do funcionario: " + f.nome);
		this.totalDeBonificacoes += f.getBonificacao();

	}

	public double getTotalDeBonificacoes() {
		return totalDeBonificacoes;
	}

}
