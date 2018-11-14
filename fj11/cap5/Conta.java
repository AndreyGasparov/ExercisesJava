package fj11.cap5;

public class Conta {
	private String titular;
	private int numero;
	private int agencia;
	private double saldo;
//	Data dataAbertura;
	
	public Conta() {
		
	}
	
	public boolean saca (double valor) {
		this.saldo -= valor;
		return true;
	}
	
	public void deposita (double valor) {
		this.saldo += valor;
	}
	
	public double calculaRendimento () {
		return this.saldo*0.1;
	}
	
	public String recuperarDadosParaImpressao() {
		String dados = "\nNome: \t\t\t"+titular;
				dados += "\nN�mero Conta: \t\t"+numero;
				dados += "\nAg�ncia: \t\t"+agencia;
//				dados += "\nData de Abertura: \t"+dataAbertura.dia+"/"+dataAbertura.mes+"/"+dataAbertura.ano;
//				dados += dataAbertura.apresentaData();
				return dados;
	}
	

}
