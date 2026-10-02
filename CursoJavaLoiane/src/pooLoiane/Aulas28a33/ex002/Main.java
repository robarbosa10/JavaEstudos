package pooLoiane.Aulas28a33.ex002;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ContaCorrente c1 = new ContaCorrente(252500);
		c1.verificarSaldo();
		c1.realizarDeposito(1001);
		
		c1.realizarSaque(1050);
		c1.verificarSaldo();
		
		c1.realizarDeposito(50);
		c1.verificarSaldo();
		c1.realizarSaque(1050);
		c1.verificarSaldo();
		
		
		sc.close();

	}

}
