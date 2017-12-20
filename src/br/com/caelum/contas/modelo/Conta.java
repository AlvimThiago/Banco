package br.com.caelum.contas.modelo;

public class Conta {

	private int numero;
	protected double saldo;
	private Cliente titular;
	private String agencia;
	private Data dataDeAbertura;
	private static int contador;

	public void transfere(double valor, Conta conta){
		this.sacar(valor);
		conta.depositar(valor);
	}
	
	public String getTipo() {

		return "Conta";

	}

	public void sacar(double valor) {
		if (saldo >= valor) {
			saldo = saldo - valor;
			System.out.println("Saldo atual: " + saldo);
		} else {
			System.out.println("Saldo insuficiente.");

		}
	}

	public void depositar(double valor) {

		saldo = saldo + valor;
		System.out.println("Saldo atual: " + saldo);
	}

	public void setNome(String nome) {
		this.titular.nome = nome;

	}

	public void setTitular(Cliente c) {
		titular = c;
	}

	public double getRendimento() {

		return saldo * 0.1;
	}

	public String getDados() {
		return ("numero: " + numero + "\nsaldo: " + saldo + "\ntitular: "
				+ titular.nome + "\nagencia: " + agencia
				+ "\ndata de abertura: " + dataDeAbertura.imprime());
	}

	public double getSaldo() {
		return saldo;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getData() {
		return dataDeAbertura.imprime();
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setData(int dia, int mes, int ano) {
		dataDeAbertura.dia = dia;
		dataDeAbertura.mes = mes;
		dataDeAbertura.ano = ano;

	}

	public void data(Data d) {
		dataDeAbertura = d;
	}

	public static void getContador() {
		System.out.println(Conta.contador);
	}

	public Data getDataDeAbertura() {
		return dataDeAbertura;
	}

	public void setDataDeAbertura(Data dataDeAbertura) {
		this.dataDeAbertura = dataDeAbertura;
	}

	public int getNumero() {
		return numero;
	}

	// public Cliente getTitular() {
	// return titular;
	// }

	public static void setContador(int contador) {
		Conta.contador = contador;
	}

	public Conta(int numero) {
		Conta.contador++;
		this.numero = numero;
	}

	public Conta() {
		Conta.contador++;

	}

	public String getTitular() {
		return this.titular.nome;
	}

}
