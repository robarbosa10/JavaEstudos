package Aula10Heranca;

public class Professor extends Pessoa{
	private String especialidade;
	private float salario;
	
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public void receberAumento() {
		float sal = (float) (this.getSalario() * 0.25) ;
		this.setSalario(this.salario + sal );
		System.out.printf("Novo salario: %.2f\n" , this.getSalario());
	}

}
