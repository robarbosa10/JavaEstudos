package exVetores;

import java.util.Scanner;

public class ex003Vetores {

	public static void main(String[] args) {
		/*Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
			mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
			ser o quadrado do respectivo elemento de A, ou seja:
			B[i] = A[i] * A[I].*/
			
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[15];
		int[] b = new int[a.length];
		
		for(int i = 0; i < a.length; i++) {
			System.out.printf("Digite o %d numero: " , i+1);
			a[i] = sc.nextInt();
			b[i] = a[i] * a[i];
		}
		for(int vet : b) {
			System.out.println("Vetor B: " + vet);
		}
		
		
		
		sc.close();
	}

}
