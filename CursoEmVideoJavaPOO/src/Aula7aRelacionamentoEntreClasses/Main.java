package Aula7aRelacionamentoEntreClasses;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lutador l1 = new Lutador("Rogerio", "Brasil", 29, 1.64f, 70f, 10, 1, 3);
		Lutador l2 = new Lutador("Fabricio", "Brasil", 31, 1.70f, 70f, 8, 2, 4);
		
		
		Luta l1Luta = new Luta();
		l1Luta.setDesafiado(l1);
		l1Luta.setDesafiante(l2);
		
		
		l1Luta.marcarLuta();
		System.out.println("------------------");
		l1Luta.lutar();
		System.out.println("-------------------");
		l1.status();
		l2.status();
	}

}
