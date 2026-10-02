package exVetores;

import java.util.Scanner;


public class ex004Vetores {

	public static void main(String[] args) {
		/*Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
			mesmo tamanho, sendo que cada elemento do vetor B deverá ser a
			raiz quadrada do respectivo elemento de A, ou seja:
			B[i] = sqrt(A[i]). */
		double[] a = new double[2];
		double[] b = new double[a.length];
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < a.length; i++) {
			System.out.printf("Digite o %d numero: " , i+1);
			a[i] = sc.nextDouble();
			b[i] = Math.sqrt(a[i]);
		}
		
		for( double vet : b) {
			System.out.println("VETOR B: " + vet);
		}
		
		
		
		
		sc.close();
	}

}
