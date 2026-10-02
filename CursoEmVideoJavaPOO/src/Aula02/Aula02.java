package Aula02;

public class Aula02 {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		Caneta c2 = new Caneta();
		
		c1.modelo = "Bic";
		c1.cor = "Azul";
		c1.carga = 90;
		c1.ponta = 1.5;
		
		c2.modelo = "Faber Castel";
		c2.cor = "Vermelha";
		c2.carga = 50;
		c2.ponta = 0.5;
		
		c1.status();
		System.out.println("*-*-*-*-*-*-*-");
		c1.destampar();
		c1.rabiscar();
		c1.tampar();
		c1.rabiscar();
		System.out.println("*-*-*-*-*-*-*-");
		c2.status();

	}

}
