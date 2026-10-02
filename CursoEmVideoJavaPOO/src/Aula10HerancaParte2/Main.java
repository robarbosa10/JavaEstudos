package Aula10HerancaParte2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Visitante v1 = new Visitante("Rogerio", 25, "masculino");
		Aluno a1 = new Aluno();
		Professor p1 = new Professor();
		Bolsista b1 = new Bolsista();
		Tecnico t1 = new Tecnico();

		System.out.printf("visitante nome: %s idade: %d sexo: %s \n", v1.getNome(), v1.getIdade(), v1.getSexo());
	}

}
