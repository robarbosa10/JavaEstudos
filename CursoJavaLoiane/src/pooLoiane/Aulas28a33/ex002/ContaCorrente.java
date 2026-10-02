package pooLoiane.Aulas28a33.ex002;

public class ContaCorrente {
	private int contaCorrente;
	private double saldo;
	private boolean especial;
	private double limite;
	
	public ContaCorrente(int contaCorrente) {
		super();
		this.contaCorrente = contaCorrente;
		this.saldo = 0;
		this.especial = false;
		this.limite = 0;
	}
	

	
	public void realizarDeposito(double valor) {
		setSaldo(getSaldo() + valor);
		System.out.printf("Valor total do deposito é R$ %.2f \n", valor);
		System.out.printf("Saldo atual: R$ %.2f \n", this.getSaldo());
		if(getSaldo() >= 1000) {
			setEspecial(true);
			setLimite(getLimite() + 100);
			System.out.printf("Cliente especial. Valor do saldo especial: R$ %.2f \n", getLimite());
		}if(getLimite() < 100 && getSaldo() < 0) {
			setLimite(100);
		}
		
	}
	
	public void realizarSaque(double valor) {
		if(valor > this.getSaldo() + this.getLimite()) {
			System.out.println("Erro, voce não tem saldo o suficiente!");
			System.out.printf("Saldo atual: R$ %.2f \n", this.getSaldo());
		}else {
			this.setSaldo(this.getSaldo() - valor);
			System.out.printf("Saque realizado com sucesso, saldo atual R$ %.2f \n", this.getSaldo());
			if(this.getSaldo() - valor < 0) {
				System.out.printf("Voce esta utilizando o limite, seu saldo atual é R$ %.2f \n", this.getSaldo());
				setLimite(this.getLimite() + this.getSaldo());
				System.out.printf("Valor limite: R$ %.2f \n", getLimite());
			}
		}
	}
	public void verificarSaldo() {
		System.out.printf("Saldo atual é : R$ %.2f e tem um limite de R$ %.2f \n", this.getSaldo(), this.getLimite());
	}
	
	
	public int getContaCorrente() {
		return contaCorrente;
	}

	public void setContaCorrente(int contaCorrente) {
		this.contaCorrente = contaCorrente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isEspecial() {
		return especial;
	}

	public void setEspecial(boolean especial) {
		this.especial = especial;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
}
