package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Ex001_negativos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai digitar ?");
		int n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		
		for(int i = 0; i<n;i++) {
			System.out.printf("Digite o %d número: ", i+1);
			vetor[i] = sc.nextInt();
		}
		
		System.out.println("**NUMEROS NEGATIVOS**");
		for(int i = 0; i<n;i++) {
			if(vetor[i]< 0) {
				System.out.println(vetor[i]);;
			}
		}
		
		
		
		
		
		
		
		sc.close();
		
		
		
		
		
	}

}
