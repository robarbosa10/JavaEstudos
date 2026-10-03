package Formula1Exercicio;

public class Carro {
	private Equipe equipe;
	private boolean montado;
	private boolean ligado;
	
	public Carro(Equipe equipe) {
		super();
		this.equipe = equipe;
		this.montado = false;
		this.ligado = false;
	}
	public Equipe getEquipe() {
		return equipe;
	}
	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}
	public boolean isMontado() {
		return montado;
	}
	public void setMontado(boolean montado) {
		this.montado = montado;
	}
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
	
	
	
}
