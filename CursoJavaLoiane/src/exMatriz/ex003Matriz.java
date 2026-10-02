package exMatriz;

import java.util.Random;
import java.util.Scanner;

public class ex003Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[][] matriz = new int[4][4];
		int[] pares = new int[16];
		int[] impares = new int[16];
		Random aleatorio = new Random();
		int par = 0, impar = 0;
		
		for(int i = 0; i < matriz.length; i++) {
			
			System.out.print("Linha " + i + " - ");
			for(int j = 0; j < matriz[i].length; j++) {
				/*System.out.println("Digite o " + j+1 + " numero:");
				matriz[i][j] = sc.nextInt();	*/
				
				matriz[i][j] = aleatorio.nextInt(10);
				if(matriz[i][j] % 2 == 0) {
					pares[i] = matriz[i][j];
					par += matriz[i][j];
				}
				System.out.print(" | " + matriz[i][j]);
				}
			System.out.println();
			}
		System.out.println(par);
		for(int i = 0; i< matriz.length; i++) {
			
		}
		System.out.println("PARES: " + pares);
		
		
		
		
		
		
		
		sc.close();

	}

}
