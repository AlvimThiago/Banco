package br.com.caelum.contas.modelo;

public class Gerente extends Funcionario {

	private int senha;
	private int numeroDeFuncionariosGerenciados;

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso Permitido!");
			return true;
		} else {
			System.out.println("Acesso Negado!");
			return false;
		}
	}

	public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}

	private void addFuncionarios() {
		this.numeroDeFuncionariosGerenciados++;

	}

	public void setSenha(int senha) {
		this.senha = senha;

	}

	@Override
	public double getBonificação() {

		return this.salario * 0.15;
	}

}
