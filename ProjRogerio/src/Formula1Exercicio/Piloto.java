package Formula1Exercicio;

public class Piloto extends Pessoa{
	private int vitorias;
	private int corridas;
	private int poles;
	private Equipe equipe;
	private Carro carro;
	
	public Piloto(String nome, String nacionalidade, int idade, Equipe equipe, Carro carro) {
		super();
		this.setNome(nome);
		this.setNacionalidade(nacionalidade);
		this.setIdade(idade);
		this.vitorias = 0;
		this.corridas = 0;
		this.poles = 0;
		this.equipe = equipe;
		this.carro = carro;
	}
	public void voltaRapida() {
		if (this.carro.isLigado() == true && this.carro.isMontado() == true) {
			System.out.println("Primeira volta rapida: " + this.getNome());
		}
		else {
			System.out.println("Verificar CARRO");
			System.out.println("Carro está ligado? " + this.carro.isLigado());
			System.out.println("Carro está montado? " + this.carro.isMontado());
		}
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getCorridas() {
		return corridas;
	}

	public void setCorridas(int corridas) {
		this.corridas = corridas;
	}

	public int getPoles() {
		return poles;
	}

	public void setPoles(int poles) {
		this.poles = poles;
	}

	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}

	@Override
	public String toString() {
		return getNome() + ": vitorias=" + vitorias + ", corridas=" + corridas + ", poles=" + poles + ", equipe=" + equipe.getNome();
	}
	
	
	
	

	
	
}
