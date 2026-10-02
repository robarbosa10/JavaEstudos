	package exVetores;

import java.util.Scanner;

public class ex005Vetores {

	public static void main(String[] args) {
		/*Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
			mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
			ser o respectivo elemento de A multiplicado por sua posição (ou
			índice), ou seja:
			B[i] = A[i] * i.*/
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		int[] b = new int[a.length];
		
		for(int i = 0 ; i < a.length; i++) {
			System.out.printf("Digite o %d numero:\n", i+1);
			a[i] = sc.nextInt();
			b[i] = a[i] * i;
		}
		
		for(int vet : b) {
			System.out.println("VETOR B: " + vet);
		}
		
		
		
		
		sc.close();

	}

}
