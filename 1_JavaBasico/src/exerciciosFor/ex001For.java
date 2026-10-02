package exerciciosFor;

import java.util.Iterator;
import java.util.Scanner;

public class ex001For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int num1 = sc.nextInt();
		
		for (int i = 1; i < num1; i++) {
			if (i % 2 != 0 ) {
				System.out.println(i + ": é impar");
				
			}else {
				System.out.println(i + ": é par");
			}
			
		}
		
		
		
		
		
		
		
		sc.close();

	}

}
