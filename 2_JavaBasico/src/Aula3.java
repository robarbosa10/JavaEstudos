import java.util.Scanner;

public class Aula3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero, para encerrar digite 999");
		int x = sc.nextInt();
		String dia;
		while (x != 999) {
			
		
		switch (x) {
		case 1:
			dia = "segunda";
			break;
		
		case 2:
			dia = "terca";
			break;
		default:
			dia = "valor invalido";
			break;
		}
		System.out.println("Dia: " + dia);
		System.out.println("Deseja continuar? ");
		int z = sc.nextInt();
		if (z == 999) {
			System.out.println("Sistema encerrado");
		}
		
		x = z;
		
		}
		sc.close();
	}

}
