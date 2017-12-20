package br.com.caelum.contas;

import br.com.caelum.contas.modelo.SeguroDeVida;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeSeguroDeVida {

	SeguroDeVida seguro;

	public void criaSeguro(Evento e) {
		this.seguro = new SeguroDeVida();
		this.seguro.setNumeroApolice(e.getInt("numeroApolice"));
		this.seguro.setTitular(e.getString("titular"));
		this.seguro.setValor(e.getDouble("valor"));

	}

}
