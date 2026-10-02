package entities;

public class Aluno extends Pessoa{
	private int matricula;
	private String curso;
	
	public Aluno() {
		
	}
	
	public void cancelarMatricula() {
		
	}

	public Aluno(int matricula, String curso) {
		super();
		this.matricula = matricula;
		this.curso = curso;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
	
}
