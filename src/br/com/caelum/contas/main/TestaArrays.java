package br.com.caelum.contas.main;

import java.util.ArrayList;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class TestaArrays {

	public static void main(String[] args) {

		int tamanho = 10;
		Conta[] c = new Conta[tamanho];
		double media = 0;
		
		for(int i = 0; i < c.length; i++){
			Conta conta = new ContaCorrente();
			conta.depositar(i * 100);
			c[i] = conta;
			media = media + c[i].getSaldo();
			System.out.print("saldo " + (i+1) + ": " + c[i].getSaldo() + ", ");
		}
		System.out.println("media dos saldos: " + media / tamanho);
		
		
		
	}
}
