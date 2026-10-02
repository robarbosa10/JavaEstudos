import java.util.Scanner;

public class Aula1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite: ");
		int x;
		
		x = sc.nextInt();
		if (x > 1) {
			System.out.println("Voce digitou: " + x + " que é maior que 1.");	
		}
		else {
			System.out.println("Voce digitou 0");
		}
		
		
		
		
		
		
		sc.close();
	}

}
