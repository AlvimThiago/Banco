package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Funcionario;
import br.com.caelum.contas.modelo.Gerente;

public class TestaGerente {

	public static void main(String[] args) {
		
		Funcionario f = new Funcionario();
		f.setSalario(100.0);
		Gerente g = new Gerente();
		g.setNome("Thiago Alvim");
		g.setSenha(123456);
		g.setSalario(100.0);
		System.out.println(g.getBonifica��o());	
		System.out.println(f.getBonifica��o());
		
		
	}

}
