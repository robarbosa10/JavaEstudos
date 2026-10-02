package Aula05exercicioBanco;

public class Banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContaBanco p1 = new ContaBanco();
		ContaBanco p2 = new ContaBanco();
		p1.status();
		p1.abrirConta(1020, "poupanca", "Rogerio");
		p1.status();
		p1.verificarSaldo();
		p1.depositar(300);
		p1.verificarSaldo();
		p1.depositar(10);
		p1.verificarSaldo();
		p1.sacar(330);
		p1.depositar(50);
		p1.verificarSaldo();
		p1.sacar(330);
		p1.fecharConta();
		p1.verificarSaldo();
		p1.status();
		
		p2.status();
		p2.abrirConta(102030, "Corrente", "Felizbirna");
		p2.status();
		p2.verificarSaldo();
		p2.depositar(500);
		p2.verificarSaldo();
		p2.sacar(499);
		p2.fecharConta();
		

	}

}
