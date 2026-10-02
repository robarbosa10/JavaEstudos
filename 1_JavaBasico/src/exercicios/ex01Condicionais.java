package exercicios;

import java.util.Scanner;

public class ex01Condicionais {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int n1 = sc.nextInt();
		if (n1 < 0) {
			System.out.println("Numero digitado: " + n1 + " NEGATIVO");
			
		}else {
			System.out.println("Numero digitado: " + n1 + " POSITIVO");
		}
		
		
		
		
		sc.close();

	}

}
