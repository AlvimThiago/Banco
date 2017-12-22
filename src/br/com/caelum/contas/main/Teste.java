package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Cliente;
import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.Data;

public class Teste {

	public static void main(String[] args) {
		Cliente cli = new Cliente();
		Cliente cli2 = new Cliente();
		Conta c = new ContaCorrente();
		Conta c2 = new ContaCorrente();
		Data data = new Data(24, 01, 1992);
		c2.setTitular(cli2);
		c.data(data);
		c.setAgencia("45678-9");
		c2.setAgencia("45678-9");
		cli.nome = "Thiago";
		c.setTitular(cli);
		cli.rg = "132546";
		cli.endereco = "Jardim Botanico";
		// data.dia = 04;
		// data.mes = 06;
		// data.ano = 2015;
		System.out.println("Saldo atual: " + c.getSaldo());
		c.depositar(400);
		// c.sacar(600);
		double rendimento = c.getRendimento();
		System.out.println("O rendimento foi de: " + rendimento);
		System.out.println(c.getDados());
		Conta.getContador();
		c.sacar(3);
		System.out.println(c.toString());
		System.out.println(c.equals(c2));
		System.out.println(c2.toString());

	}

}
