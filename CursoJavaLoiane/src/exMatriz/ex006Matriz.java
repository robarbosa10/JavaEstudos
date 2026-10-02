package exMatriz;

import java.util.Scanner;

public class ex006Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);

		String[][] jogoVelha = new String[3][3];
		int jogada = 0; 
		int posLinha=0, posColuna = 0;

		while(true) {
			if(jogada == 9) {
				System.out.println("Deu empate");
				break;
			}
			else {
				if(jogada % 2 == 0 ) {
					System.out.println("Vez do jogador 1 = X");
					for(int i =0; i < jogoVelha.length; i++) {
						System.out.print(" ");
						for(int j =0; j < jogoVelha[i].length; j++) {
							if(jogoVelha[i][j] == null) {
								System.out.print(" " + "|");
							}else {
								System.out.print(jogoVelha[i][j] + "|");
							}
						}
						System.out.println();
					}
					System.out.println("Escolha a linha de 1 a 3");
					posLinha = sc.nextInt() - 1;
					System.out.println("Escolha a coluna de 1 a 3");
					posColuna = sc.nextInt() - 1;

					for(int i =0; i < jogoVelha.length; i++) {
						for(int j = 0; j < jogoVelha[i].length; j++) {
							
							jogoVelha[posLinha][posColuna] = "X";
						}
					}
					jogada ++;
				}else {
					System.out.println("Vez do jogador 2 = O");
					for(int i =0; i < jogoVelha.length; i++) {
						System.out.print(" ");
						for(int j =0; j < jogoVelha[i].length; j++) {
							if(jogoVelha[i][j] == null) {
								System.out.print(" " + "|");
							}
							else {
								System.out.print(jogoVelha[i][j] + "|");
							}
						}
						System.out.println();
					}
					System.out.println("Escolha a linha de 1 a 3");
					posLinha = sc.nextInt() - 1;
					System.out.println("Escolha a coluna de 1 a 3");
					posColuna = sc.nextInt() - 1;

					for(int i =0; i < jogoVelha.length; i++) {
						for(int j = 0; j < jogoVelha[i].length; j++) {
							jogoVelha[posLinha][posColuna] = "O";
						}
					}
					jogada ++;
				}
			}
		}



		sc.close();



	}

}
