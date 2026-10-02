package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Ex005_MaiorPosicao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos numeros vai digitar? ");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for(int i = 0 ; i<n ; i++) {
			System.out.printf("Digite o %d numero: ", i+1);
			vetor[i] = sc.nextDouble();
			
		}
		
		double maior = 0;
		int posicao = 0;
		for(int i = 0; i<n; i++) {
			if(vetor[i] > maior) {
				maior = vetor[i];
				posicao = i;
			}
		}
		System.out.println("MAIOR VALOR = " + maior);
		System.out.println("Posicao do maior valor = " + posicao);
		
		
		
		
		sc.close();

	}

}
