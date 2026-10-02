package Aula10HerancaParte2;

public class Professor extends Pessoa{
	private String especialidade;
	private double salario;
	
	public void receberSalario() {
		this.setSalario(this.getSalario() * 0.25);
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

}
