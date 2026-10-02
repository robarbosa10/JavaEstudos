package Aula02Exercicio;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controle c1 = new Controle();
		
		c1.cor = "Branco";
		c1.marca = "X-box";
		c1.modelo = "one s";
		
		c1.status();
		c1.conectar();
		c1.ligar();
		c1.conectar();
		c1.desligar();
		c1.conectar();

	}

}
