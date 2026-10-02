package pooLoiane.Aulas28a33.ex003;

public class Aluno {
	private String nome;
	private int matricula;
	private String curso;
	private String[] nomeDisciplinas = new String[3];
	double[][] notasDisciplinas = new double[3][4];
	
	public Aluno() {
		super();
		this.nome = "Jose";
		this.matricula = 123548;
		this.curso = "PT";
	}
	
	public double aprovado() {
		double resultado = 0;
		
		for(int i = 0; i < getNotasDisciplinas().length; i++) {
			for(int j =  0 ; j < getNotasDisciplinas()[i].length; j++) {
				resultado += getNotasDisciplinas()[i][j];
			}
		}
		System.out.println(resultado);
		return resultado;
	} 
	


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public String[] getNomeDisciplinas() {
		return nomeDisciplinas;
	}

	public void setNomeDisciplinas(String[] nomeDisciplinas) {
		this.nomeDisciplinas = nomeDisciplinas;
	}

	public double[][] getNotasDisciplinas() {
		return notasDisciplinas;
	}

	public void setNotasDisciplinas(double[][] notasDisciplinas) {
		this.notasDisciplinas = notasDisciplinas;
	}
	
	
	
	
	
}
