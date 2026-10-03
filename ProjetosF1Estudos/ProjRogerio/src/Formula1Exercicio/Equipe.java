package Formula1Exercicio;

public class Equipe {
	private String nome;
	private Piloto[] pilotos;

	public Equipe(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Piloto[] getPilotos() {
		return pilotos;
	}

	public void setPilotos(Piloto[] pilotos) {
		this.pilotos = pilotos;
	}
	
	
}
