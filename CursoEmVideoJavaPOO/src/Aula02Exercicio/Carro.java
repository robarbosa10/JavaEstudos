package Aula02Exercicio;

public class Carro {
	String cor;
	String modelo;
	String marca;
	int ano;
	boolean ligado = false;
	
	void status(){
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Marca: " + this.marca);
		System.out.println("Cor: " + this.cor);
		System.out.println("ano: " + this.ano);
		System.out.println("Está ligado? " + this.ligado);
	}
	
	

	void dirigir() {
		if(ligado == false) {
			System.out.println("Erro, Carro desligado.");
		}else {
			System.out.println("Carro andando!");
		}
	}
	void ligar() {
		this.ligado = true;
		System.out.println("Carro ligou");
	}
	void desligar() {
		this.ligado = false;
		System.out.println("Carro desligou");
	}
}
