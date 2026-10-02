package exVetores;

import java.util.Scanner;

public class ex006Vetores {

	public static void main(String[] args) {
		/*6. Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
			um vetor C, onde cada elemento de C é a soma dos respectivos
			elementos em A e B, ou seja:
			C[i] = A[i] + B[i].*/
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		int[] b = new int[a.length];
		int[] c = new int[a.length];
		
		for(int i = 0; i < a.length; i++) {
			System.out.printf("Digite o %d do vetor A:\n", i+1);
			a[i] = sc.nextInt();
			System.out.printf("Digite o %d do vetor B:\n", i+1);
			b[i] = sc.nextInt();
		}
		for(int i = 0; i < a.length; i++) {
			c[i] = a[i] + b[i];
		}
		
		for(int vet : c) {
			System.out.println("VETOR C: " + vet);
		}
		
		
		sc.close();

	}

}
