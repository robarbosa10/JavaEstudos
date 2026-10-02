package f1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Equipe e1 = new Equipe("Ferrari");
		ChefeEquipe c1 = new ChefeEquipe("Toto", 45, e1);
		e1.setChefe(c1);
		
		Piloto p1 = new Piloto("Hamilton", 39);
		Piloto p2 = new Piloto("Leclerc", 25);
		
		//função que o chefe da equipe escolhe os pilotos
		c1.EscolherPilotos(p1, p2);
		
		

	}

}
