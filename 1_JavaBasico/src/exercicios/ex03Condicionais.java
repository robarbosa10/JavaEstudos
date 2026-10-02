package exercicios;

import java.util.Scanner;

public class ex03Condicionais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		int n1 = sc.nextInt();
		System.out.println("Digite o segundo numero: ");
		int n2 = sc.nextInt();
		int n3 = n1 + n2;
		
		if (n3 % 2 == 0) {
			System.out.println("Os numero: " + n1 + " e " + n2 + " São multiplos");
		}else {
			System.out.println("Os numero: " + n1 + " e " + n2 + " Não sao multiplos");
		}
		
		
		
		
		
		sc.close();

	}

}
