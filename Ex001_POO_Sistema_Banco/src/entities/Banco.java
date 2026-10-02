package entities;

public class Banco {
	private int conta;
	private String nome;
	private Double valorConta = 0.0;
	
	
	public Banco(int conta, String nome, Double valorConta) {
		this.conta = conta;
		this.nome = nome;
		this.valorConta = valorConta;
	}
	public Banco(int conta, String nome) {
		this.conta = conta;
		this.nome = nome;
	}


	public int getConta() {
		return conta;
	}


	public void setConta(int conta) {
		this.conta = conta;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValorConta() {
		return valorConta;
	}

	public void setValorConta(Double valorConta) {
		this.valorConta = valorConta;
	}
	
	public double Depositar(double deposito) {
		double valor = this.valorConta;
		valor += deposito;
		this.valorConta = valor;
		return this.valorConta;
	}
	public double Sacar(double sacar) {
		this.valorConta -= sacar + 5;
		return this.valorConta;
	}
	
	
}
