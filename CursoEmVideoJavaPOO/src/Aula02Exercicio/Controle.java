package Aula02Exercicio;

public class Controle {
	String cor;
	String marca;
	String modelo;
	boolean ligado = false;
	boolean conectado = false;
	
	void status() {
		System.out.println("Cor: " + this.cor);
		System.out.println("Marca: " + this.marca);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Ligado: " + this.ligado);
		System.out.println("Conectado: " + this.conectado);
	}
	
	void ligar() {
		this.ligado = true;
		System.out.println("Ligando...");
	}
	void conectar() {
		if(this.ligado == false && conectado == false) {
			System.out.println("Erro, voce precisa ligar o controle para conectar.");
		}else {
			System.out.println("Conectado");
		}
	}
	void desligar() {
		this.ligado = false;
		System.out.println("Controle desligado");
	}

}
