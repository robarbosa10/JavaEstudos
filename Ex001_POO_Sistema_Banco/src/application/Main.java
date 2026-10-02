package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Banco;

public class Main {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome: ");
		String nome1 = sc.nextLine();
		System.out.println("Digite a conta: ");
		int conta1 = sc.nextInt();
		Banco banco = new Banco(conta1, nome1);
		

		int continuar = 1;
		while(continuar == 1) {
			System.out.println("Qual o valor do deposito: ");
			double valor_deposito = sc.nextDouble();
			banco.Depositar(valor_deposito);
			System.out.println("valor total R$" + banco.getValorConta());
			valor_deposito = 0;
			System.out.println("deseja relizar outro deposito:");
			System.out.println("1: SIM\n2: NÃO");
			continuar = sc.nextInt();
		}
		
		System.out.println("valor total na sua conta: R$" + banco.getValorConta());
		System.out.println("Digite o valor do saque:  ");
		double valor_saque = sc.nextDouble();
		banco.Sacar(valor_saque);
		System.out.println("valor total na sua conta R$" + banco.getValorConta());
		sc.close();

	}

}
