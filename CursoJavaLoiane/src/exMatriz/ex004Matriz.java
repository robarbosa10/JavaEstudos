package exMatriz;

import java.util.Scanner;

public class ex004Matriz {

	public static void main(String[] args) {
		/*4. Faça um programa para armazenar em uma matriz os
			compromissos de uma agenda pessoal. Cada dia do mês deve
			conter 24 horas, onde para cada uma destas 24 horas podemos
			associar um tarefa específica (compromisso agendado). O
			programa deve ter um menu onde o usuário indica o dia do mês
			que deseja alterar e a hora, entrando em seguida com o
			compromisso, ou então, o usuário pode também consultar a
			agenda, fornecendo o dia e a hora para obter o
			compromisso armazenado*/
		Scanner sc = new Scanner(System.in);
		
		int dia = 31, horas = 24, escolha = 0, diaAgenda=0, horaAgenda=0;
		String compromisso1;
		
		String[][] agenda = new String[dia][horas];

		
		System.out.println("1: agendar comprimisso");
		System.out.println("2: excluir compromisso");
		System.out.println("3: mostrar agenda");
		System.out.println("999: sair");
		escolha = sc.nextInt();
		if(escolha != 1 || escolha != 2 || escolha != 3 ) {
			System.out.println("Erro, tente novamente");
			System.out.println("1: agendar comprimisso");
			System.out.println("2: excluir compromisso");
			System.out.println("3: mostrar agenda");
			System.out.println("999: sair");
			escolha = sc.nextInt();
		}
		
		while(escolha != 999) {
			if(escolha == 1) {
				System.out.println("Qual o dia");
				diaAgenda = sc.nextInt();
				System.out.println("Qual a hora ?");
				horaAgenda = sc.nextInt();
				System.out.println("Qual o comprimisso? ");
				compromisso1 = sc.next();
				for(int i = 0; i < agenda.length; i++) {
					//System.out.println("Dia: " + i);
					for(int j = 0; j < agenda[diaAgenda].length; j++) {
						if(agenda[diaAgenda][horaAgenda] == null) {
							agenda[diaAgenda][horaAgenda] = compromisso1;
							System.out.print("Hora agendada com sucesso: " + agenda[diaAgenda][horaAgenda] + " \n");
							
						}else {
							break;	
						}	
					}
				}
			}
			if(escolha == 2) {
				System.out.println("Qual o dia? ");
				diaAgenda = sc.nextInt();
				System.out.println("Qual a hora? ");
				horaAgenda = sc.nextInt();
				for(int i = 0; i < agenda.length; i++) {
					if(agenda[diaAgenda][horaAgenda] != null) {
						agenda[diaAgenda][horaAgenda] = null;
						System.out.println("Compromisso excluido com sucesso.");
					}if(agenda[diaAgenda][horaAgenda] == null) {
						System.out.println("Voce nao tem nenhum compromisso nessa data");
						break;
					}
				}
			}
			if(escolha == 3) {
				
				System.out.println();
				for(int i =0 ; i <agenda.length; i++) {
					System.out.print("dia: " + i + " ");
					for(int j = 0 ; j < agenda[i].length; j++) {
						if(agenda[i][j] == null) {
							
							System.out.print("|" + j + ":00");
						}
						else {
							System.out.print("|" + agenda[i][j] + " " + j + ":00 horas");
						}
					}
					System.out.println();
				}
				
			}
			
			
			
			
			
			System.out.println("1: agendar comprimisso");
			System.out.println("2: excluir compromisso");
			System.out.println("3: mostrar agenda");
			System.out.println("999: sair");
			escolha = sc.nextInt();
			if(escolha != 1 || escolha != 3 || escolha != 2 ) {
				System.out.println("Erro, tente novamente");
				System.out.println("1: agendar comprimisso");
				System.out.println("2: excluir compromisso");
				System.out.println("3: mostrar agenda");
				System.out.println("999: sair");
				escolha = sc.nextInt();
			}
			
		}
		
		
		
		
		
		
		sc.close();
	}

}
