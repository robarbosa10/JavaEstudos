package Aula02;

public class Caneta {
	String modelo;
	String cor;
	Double ponta;
	int carga;
	boolean tampada = true;
	void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Status: " + this.tampada);
	}
	
	void rabiscar() {
		if(tampada == true) {
			System.out.println("Tente novamente, sua caneta está tampada!");
		}else {
			System.out.println("Rabiscando");
		}
		
	}
	void tampar() {
		this.tampada = true;
		
	}
	void destampar() {
		this.tampada = false;
		
	}
}	
