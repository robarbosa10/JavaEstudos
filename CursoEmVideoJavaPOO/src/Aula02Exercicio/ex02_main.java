package Aula02Exercicio;

public class ex02_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro c1 = new Carro();
		
		c1.cor = "Branco";
		c1.ano = 2015;
		c1.marca = "Toyota";
		c1.modelo = "Etios";
		
		c1.dirigir();
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*");
		c1.ligar();
		c1.dirigir();
		c1.desligar();

	}

}
