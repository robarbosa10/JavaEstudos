package exercicios;

import java.util.Scanner;

public class ex04Condicionais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro horario: ");
		int n1 = sc.nextInt();
		System.out.println("Digite o segundo horario: ");
		int n2 = sc.nextInt();
		
		if (n1 > n2) {
			int duracao = (24 - n1) + n2;
			System.out.println("A partida durou: " + duracao + " horas");
		}if (n1 == n2) {
			System.out.println("A partida durou: 24 horas");
		}if (n1 < n2) {
			int duracao = n2 - n1;
			System.out.println("A partida durou: " + duracao + " horas");
		}
		
		sc.close();

	}

}
