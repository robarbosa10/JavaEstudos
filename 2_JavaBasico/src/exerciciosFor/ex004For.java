package exerciciosFor;

import java.util.Scanner;

public class ex004For {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos casos vai analisar ?");
		int n = sc.nextInt();
		double num2 = 0;
		
		for(int i= 0; i < n; i++) {
			System.out.println("Qual o numero real? ");
			double num1 = sc.nextDouble();
			num2 = num2 + num1;
		}
		System.out.println(num2%.2 / n);
		
		
		
		
		
		
		sc.close();
	}

}
