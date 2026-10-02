import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//System.out.println("Ola Mundo");
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		x = sc.next();
		System.out.println("Voce digitou: " + x);
		y = sc.nextInt();
		System.out.println("voce digitou o numero: " + y);
		
		sc.close();
	}

}
