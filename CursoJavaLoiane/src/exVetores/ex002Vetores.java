package exVetores;

import java.util.Scanner;

public class ex002Vetores {

	public static void main(String[] args) {
		/*2. Criar um vetor A com 8 elementos inteiros. Construir um vetor B de
			mesmo tipo e tamanho e com os elementos do vetor A multiplicados
			por 2, ou seja: B[i] = A[i] * 2.*/
		
		Scanner sc = new Scanner(System.in);
		int[] a = new int[8];
		int[] b = new int[8];
		
		for(int i = 0; i < a.length; i++) {
			System.out.printf("Digite o %d numero:\n " , i+1);
			a[i] = sc.nextInt();
			b[i] = a[i] * 2;
		}
		
		for(int vet : b) {
			System.out.println("vetor b: " + vet);
		}
		
		
		
		
		sc.close();
		
	}

}
