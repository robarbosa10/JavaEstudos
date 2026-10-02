package Aula10Heranca;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		p1.setNome("Pedro");
		p2.setNome("Jose");
		p3.setNome("Aurelio");
		p4.setNome("Sandra");
		
		p1.setIdade(22);
		p3.setSalario(1000);
		
		p1.setSexo("Masculino");
		
		System.out.println("salario" + p3.getSalario());
		
		p3.receberAumento();
		
		System.out.println("salario" + p3.getSalario());
		
		/*System.out.printf("nome: %s idade: %d \n", p1.getNome(), p1.getIdade());
		p1.fazerAniversario();
		System.out.printf("nome: %s idade: %d \n", p1.getNome(), p1.getIdade());
		
		
		System.out.printf("Pessoa %s, Aluno %s, Professor %s, Funcionario %s \n", p1.getNome(), p2.getNome(), p3.getNome(), p4.getNome());
   			*/
	}

}
