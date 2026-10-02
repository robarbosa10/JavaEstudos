import java.util.Scanner;

public class Aula2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num1;
		int num2;
		System.out.println("Digite um numero: ");
		num1 = sc.nextInt();
		System.out.println("Digite o numero 2");
		num2 = sc.nextInt();
		int num3 = num1 + num2;
		if (num1 > num2) {
			System.out.println("O numero 1 é maior");
		}else {
			System.out.println("o numero 2 é maior");
		}
		
		System.out.println("Voce digitou: " + num1 + " Depois digitou: " + num2 + ". A soma total deles é: " + num3);
		
		
		
		
		sc.close();
	}

}
