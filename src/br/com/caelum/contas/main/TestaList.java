package br.com.caelum.contas.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.caelum.contas.modelo.Cliente;
import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaList {

	public static void main(String[] args) {
		
		List <Conta> contas = new ArrayList<>();
		Conta c1 = new ContaCorrente();
		Conta c2 = new ContaCorrente();
		Conta c3 = new ContaCorrente();
		Conta c4 = new ContaCorrente();
		Cliente cli1 = new Cliente();
		Cliente cli2 = new Cliente();
		Cliente cli3 = new Cliente();
		Cliente cli4 = new Cliente();
		
		c1.setTitular(cli1);
		c2.setTitular(cli2);
		c3.setTitular(cli3);
		c4.setTitular(cli4);
		c1.setNome("thiago");
		c2.setNome("alex");
		c3.setNome("pedro");
		c4.setNome("thaine");
		contas.add(c1);
		contas.add(c2);
		contas.add(c3);
		contas.add(c4);
		Collections.sort(contas);
		for(int i = 0; i < contas.size(); i++) {
			
			System.out.println(contas.get(i).getNome());
		}
		
		
			
			
		
		

	}

}
