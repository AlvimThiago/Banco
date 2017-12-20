package br.com.caelum.contas.main;
import br.com.caelum.contas.modelo.Cliente;
import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaPoupanca;
import br.com.caelum.contas.modelo.Data;


public class Teste {
	
	public static void main (String[]args){
		Cliente cli = new Cliente();
		Conta c = new ContaPoupanca();
		Data data = new Data(24,01,1992);
		c.data(data);
		c.setAgencia("45678-9");
		cli.nome = "Thiago";
		c.setTitular(cli);
		cli.rg = "132546";
		cli.endereco = "Jardim Botanico";
		//data.dia = 04;
		//data.mes = 06;
		//data.ano = 2015;		
		System.out.println("Saldo atual: " + c.getSaldo());
		c.depositar(400);
		c.sacar(600);
		double rendimento = c.getRendimento();
		System.out.println("O rendimento foi de: " + rendimento);
		System.out.println(c.getDados());
				Conta.getContador();
		
		
	}

}
