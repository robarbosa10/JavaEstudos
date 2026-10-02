package exVetores;

import java.util.Scanner;

public class ex001Vetores {

	public static void main(String[] args) {
		/*1. Criar um vetor A com 5 elementos inteiros. Construir um vetor B de
			mesmo tipo e tamanho e com os "mesmos" elementos do vetor A, ou
			seja, B[i] = A[i].
		 */
		
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5]; 
		int[] b = new int[5];
		
		for(int i = 0; i< a.length; i++) {
			System.out.printf("Digite o %d numero: " , i+1);
			a[i] = sc.nextInt();
			b[i] = a[i];
		}
		for(int vet : b){
			System.out.println("VETOR B: " + vet);
		}
		
		sc.close();
	}

}
