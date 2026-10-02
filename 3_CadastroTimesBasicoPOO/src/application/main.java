package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Clube;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Qual o nome do clube? ");
		String nome = sc.nextLine();
		System.out.println("Qual a cidade? ");
		String cidade = sc.nextLine();
		System.out.println("Qual o nome do tecnico? ");
		String tecnico = sc.nextLine();
		
		
		
		Clube cb = new Clube(nome, cidade, tecnico);
		Clube cb2 = new Clube(nome, cidade);
		
		System.out.printf("O clube %s que fica na cidade %s", cb2.getNome(), cb2.getCidade());
		

		
		
		
		sc.close();
	}
	
	

}
