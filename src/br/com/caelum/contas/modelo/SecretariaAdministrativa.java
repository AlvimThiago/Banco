package br.com.caelum.contas.modelo;

public class SecretariaAdministrativa extends Secretaria{
	
	@Override
	public double getBonificacao() {
		return this.salario * 1.2 + 180;
	}

}
