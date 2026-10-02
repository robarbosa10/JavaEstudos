package lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AulaLista {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		
		int op = 1;
		
		while(op == 1){
			System.out.println("Digite o numero: ");
			int n = sc.nextInt();
			list.add(n);
			System.out.println("Deseja continuar? 1: sim  2: nao");
			op = sc.nextInt();
		}
		
		for(int x : list) {
			System.out.println("Numero digitado " + x);
		}
		
		sc.close();
	}

}
