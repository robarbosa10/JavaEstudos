package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;
import entities.Funcionario;
import entities.Professor;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		Aluno a1 = new Aluno();
		Professor pr1 = new Professor();
		Funcionario f1 = new Funcionario();

		a1.setNome("Jose");
		a1.setIdade(13);
		a1.setSexo("M");
		

		System.out.println(a1);
		
		
		sc.close();

	}

}
