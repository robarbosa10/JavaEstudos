package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Ex004_numerosPares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos numeros vai digitar ?");
		int n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		
		for(int i = 0; i<n ; i++) {
			System.out.printf("Digite o %d numero: ", i+1);
			vetor[i] = sc.nextInt();
		}
		System.out.println("**NUMEROS PARES**");
		for(int i = 0; i<n; i++) {
			if(vetor[i] % 2 == 0) {
				System.out.print(" " + vetor[i]);
			}
		}
		
		
		
		
		
		
		
		
		sc.close();
	}

}
