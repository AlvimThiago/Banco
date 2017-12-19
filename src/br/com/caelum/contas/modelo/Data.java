package br.com.caelum.contas.modelo;

public class Data {
	int dia;
	int mes;
	int ano;
	public String imprime(){
		return (dia + "/" + mes + "/" + ano);
	}
	
	public Data(int dia, int mes, int ano){
		if(dia <= 31 && dia >=1)
		{
			if(((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia < 30)) || (mes == 2 && dia < 28) || (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)){
				this.dia = dia;
				this.mes = mes;
				this.ano = ano;
			}
			
			
		}else
		{
			System.out.println("Data invalida!");
		}
		
	}
}
