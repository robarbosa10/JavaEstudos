package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Ex002_somaVetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos numeros vai digitar ?");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for(int i = 0 ; i<n;i++) {
			System.out.printf("Digite o %d numero:", i+1);
			vetor[i] = sc.nextDouble();
		}
		double soma = 0;
		double media = 0;
		System.out.println("**VALORES**");
		for(int i = 0; i<n; i++) {
			System.out.print(vetor[i] + " ");
			soma += vetor[i];
			media = soma / n;
		}
		System.out.println();
		System.out.printf("A soma de todos esses numeros é: %.2f \n", soma);
		System.out.printf("A media de todos esses numeros é: %.2f \n", media);
		
		sc.close();

	}

}
