package exMatriz;

import java.util.Random;

public class ex002Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matriz = new int[10][10];
		Random aleatorio = new Random();
		
		int maiorLinha = 0, menorLinha = 1, maiorColuna = 0, menorColuna = 0, nmrLinhaMaior = 0, nmrLinhaMenor = 0;
		System.out.print("Coluna:    ");
		for(int i = 0 ; i < matriz.length; i++) {
			System.out.print("|" + i);
			
		}
		
		System.out.println();
		System.out.println("            __________________");
		for(int i = 0; i < matriz.length; i++) {
			System.out.print("Linha: " + i + " - ");
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = aleatorio.nextInt(10);
				System.out.print("|" + matriz[i][j]);
			}
			System.out.println();
		}
		
		for(int i = 0; i< matriz.length; i++) {
			if(matriz[5][i] > maiorLinha) {
				maiorLinha = matriz[5][i];
				nmrLinhaMaior = i;
			}
			if(matriz[5][i] < menorLinha)
				menorLinha = matriz[5][i];
				nmrLinhaMenor = i;
			}
			
		
		System.out.printf("Maior da linha 5 é : %d na coluna %d \n", maiorLinha, nmrLinhaMaior);
		System.out.printf("Menor da linha 5 é : %d na coluna %d \n", menorLinha, nmrLinhaMenor);

	}

}
