package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.ControleDeBonificacoes;
import br.com.caelum.contas.modelo.Funcionario;
import br.com.caelum.contas.modelo.Gerente;

public class TestaGerente {

	public static void main(String[] args) {
		
		Funcionario f = new Funcionario();
		f.setSalario(100.0);
		ControleDeBonificacoes cb = new ControleDeBonificacoes();
		Gerente g = new Gerente();
		g.setNome("Thiago Alvim");
		g.setSenha(123456);
		g.setSalario(100.0);
		System.out.println("Bonificação do gerente: " + g.getBonificacao());	
		System.out.println("Bonificação do funcionario: " + f.getBonificacao());
		System.out.println("Funcionarios gerenciados: " + g.addFuncionarios());
		System.out.println("Funcionarios gerenciados: " + g.addFuncionarios(5));
		Funcionario k = new Gerente();
		k.setSalario(1000);
		System.out.println("Bonificação do k: " + k.getBonificacao());
		cb.registra(f);
		cb.registra(g);
		System.out.println("Total de bonificações: " + cb.getTotalDeBonificacoes());
		
	}

}
