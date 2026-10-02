package pooLoiane.Aulas28a33.ex003;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno a1 = new Aluno();
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < a1.getNotasDisciplinas().length; i++) {
			for(int j = 0; j < a1.getNotasDisciplinas()[i].length; j++) {
				System.out.println("Adiciona a nota: ");
				double n1 = sc.nextDouble();
				a1.notasDisciplinas[i][j] = n1;
			}
		}
		
		for(int i =0; i < a1.getNotasDisciplinas().length; i++) {
			System.out.print("Linha " + i);
			for(int j = 0 ; j < a1.getNotasDisciplinas()[i].length; j++) {
				System.out.print("|" + a1.getNotasDisciplinas()[i][j]);
			}
			System.out.println(" ");
		}
		
		a1.aprovado();
		
		
		
		
		
		sc.close();
	}

}
