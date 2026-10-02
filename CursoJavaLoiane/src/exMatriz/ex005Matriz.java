package exMatriz;

import java.util.Scanner;

public class ex005Matriz {

	public static void main(String[] args) {
		/*4. 5. Modifique o programa anterior de maneira a guardar os
				compromissos de todo o ano, organizados por mês, dia e hora
				(só 8 horas por dia).*/
		Scanner sc = new Scanner(System.in);
		
		int mes= 12, dia = 31, horas = 8, escolha = 0, mesAgenda=0, diaAgenda=0, horaAgenda=0;
		String compromisso1;
		
		String[][][] agenda = new String[mes][dia][horas];

		
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
		
		while(escolha != 999) {
			if(escolha == 1) {
				System.out.println("Qual o mes?");
				mesAgenda = sc.nextInt();
				System.out.println("Qual o dia? ");
				diaAgenda = sc.nextInt();
				System.out.println("Qual a hora ?");
				horaAgenda = sc.nextInt();
				System.out.println("Qual o comprimisso? ");
				compromisso1 = sc.next();
				for(int i = 0; i < agenda.length; i++) {
					//System.out.println("Dia: " + i);
					for(int j = 0; j < agenda[mesAgenda].length; j++) {
						for(int k = 0; k < agenda[diaAgenda].length; k++) {
						if(agenda[mesAgenda][diaAgenda][horaAgenda] == null) {
							agenda[mesAgenda][diaAgenda][horaAgenda] = compromisso1;
							System.out.print("Hora agendada com sucesso: " + agenda[mesAgenda][diaAgenda][horaAgenda] + " \n");
						}
						
						else {
							break;	
						}
					}
				}
			}}
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
