package Formula1Exercicio;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Equipe e1 = new Equipe("Ferrari");
		Carro c1 = new Carro(e1);
		Mecanico m1 = new Mecanico(e1, c1);
		
		Piloto p1 = new Piloto("Norris", "Inglaterra", 25, e1, c1);
		Piloto p2 = new Piloto("Hamilton", "Inglaterra", 41, e1, c1);
		
		
		//testando se o carro consegue ir pra pista dar volta com ele desmontado e desligado
		p1.voltaRapida();
		System.out.println("*-*-");
		//ligando o carro sem estar montado
		m1.ligarCarro();
		//montando carro
		m1.montarCarro();
		//ligando carro
		m1.ligarCarro();
		System.out.println("*-*-");
		p1.voltaRapida();

		
	}

}
