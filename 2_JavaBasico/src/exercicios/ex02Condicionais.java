package exercicios;

import java.util.Scanner;

public class ex02Condicionais {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int n1 = sc.nextInt();
		if (n1 % 2 == 0) {
			System.out.println("NUMERO PAR");
		}else {
			System.out.println("NUMERO IMPAR");
		}
		
		
		
		sc.close();

	}

}
