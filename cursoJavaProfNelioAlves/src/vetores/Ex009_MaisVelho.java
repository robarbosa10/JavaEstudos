package vetores;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Ex009_MaisVelho {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas pessoas vai digitar? ");
		int n = sc.nextInt();
		
		Pessoa[] vetor = new Pessoa[n];
		
		for(int i = 0; i<n ; i++) {
			System.out.printf("Digite o %d nome: \n", i+1);
			String nome = sc.next();
			System.out.printf("Digite a idade : \n");
			int idade = sc.nextInt();
			vetor[i] = new Pessoa(nome, idade);
		}
		
		int velho = 0;
		String maisvelho = "";
		for(int i = 0; i<n; i++) {
			if(velho < vetor[i].getIdade()) {
				maisvelho = vetor[i].getNome();
				velho = vetor[i].getIdade();
			}
		}
		System.out.printf("A pessoa mais velha é: %s com %d anos.", maisvelho, velho);
		
		sc.close();

	}

}
