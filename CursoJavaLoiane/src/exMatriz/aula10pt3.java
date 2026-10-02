package exMatriz;

import java.util.Random;

public class aula10pt3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[][][] matriz = new int[3][3][3];
			
			Random aleatorio = new Random();
			
			for(int i = 0; i < matriz.length; i++) {
				System.out.print("Linha: " + i + " - ");
				for(int j = 0; j < matriz[i].length; j++) {
					
					for(int k = 0; k < matriz[i][j].length; k++) {
						matriz[i][j][k] = aleatorio.nextInt(10);
						System.out.print(matriz[i][j][k]);
						
					}
				}
				System.out.println();
			}

	}

}
