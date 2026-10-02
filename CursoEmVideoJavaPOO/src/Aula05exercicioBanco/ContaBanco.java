package Aula05exercicioBanco;

public class ContaBanco {
	private int numConta;
	private String tipo;
	private String dono;
	private float saldo;
	public boolean status;
	
	
	public void status() {
		if(status != false) {
		System.out.println("*-*-*-*-*-*-*-*-");
		System.out.println("Conta numero: " + this.getNumConta());
		System.out.println("Dono: " + this.getDono());
		if(status == true) {
			System.out.println("Conta está aberta.");
		}else {
			System.out.println("Conta fechada.");
		}
		System.out.println("*-*-*-*-*-*-*-*-");
		}else {
			System.out.println("erro, não possui conta.");
		}
	}
	
	
	
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public void abrirConta(int numConta, String tipo, String dono) {
		if(this.status == false) {
			this.numConta = numConta;
			this.tipo = tipo;
			this.dono = dono;
			this.status = true;
			System.out.println("Conta aberta com sucesso.");
		}else {
			System.out.println("Erro, essa conta ja está aberta.");
		}
		
	}
	
	public void fecharConta() {
		this.setDono(null);
		this.setNumConta(0);
		this.setSaldo(0);
		this.setStatus(false);
		this.setTipo(null);
		System.out.println("Conta fechada com sucesso!");
		
	}
	public void depositar(float dinheiro) {
		this.setSaldo(this.getSaldo() + dinheiro);
		
	}
	public void verificarSaldo() {
		System.out.println("Seu saldo é: " + this.getSaldo());
	}
	
	public void sacar(float dinheiro) {
		if(dinheiro > this.getSaldo()) {
			System.out.println("Erro, voce nao tem saldo o suficiente. Seu saldo é: R$ " + this.getSaldo());
		}else {
			System.out.println("Voce sacou: " + dinheiro);
			this.setSaldo(this.getSaldo() - dinheiro);
			System.out.println("Seu novo saldo é: R$" + this.getSaldo());
		}
		
	}
	
	public void pagarMensalidade() {
		
	}
}
