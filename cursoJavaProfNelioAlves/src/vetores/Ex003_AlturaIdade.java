package vetores;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Ex003_AlturaIdade {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas pessoas serão cadastradas? ");
		int n = sc.nextInt();
		
		Pessoa[] vetor = new Pessoa[n];
		
		for(int i=0; i<n;i++) {
			System.out.printf("Qual o %s nome \n", i+1 );
			String nome = sc.next();
			System.out.println("Qual a idade? ");
			int idade = sc.nextInt();
			System.out.println("Qual a altura? ");
			double altura = sc.nextDouble();
			vetor[i] = new Pessoa(nome, idade, altura);
		}
		
		double altura_media = 0;
		double menor = 0;
		String nome;
		
		for(int i =0; i<n;i++) {
			System.out.printf("nome: %s tem %d anos e a altura é %.2f \n", vetor[i].getNome(), vetor[i].getIdade(), vetor[i].getAltura());
			altura_media += vetor[i].getAltura()/n;
			if(vetor[i].getIdade()< 16) {
				System.out.printf("nome: %s tem %d anos e a altura é %.2f \n", vetor[i].getNome());
			}
			
			System.out.printf("Altura media %.2f \n", altura_media);
		 
		}
		
		
		
		
		
		
		
		
		sc.close();

	}

}
