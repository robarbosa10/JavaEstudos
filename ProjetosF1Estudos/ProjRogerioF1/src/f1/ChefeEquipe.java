package f1;

public class ChefeEquipe extends Pessoa{
	private Equipe equipe;
	private Piloto piloto;
	private ChefeEquipe chefe;
	
	
	public ChefeEquipe(String nome, int idade, Equipe equipe) {
		super(nome, idade);
		this.equipe = equipe;
		this.chefe = chefe;
	}



	public Piloto getPiloto() {
		return piloto;
	}



	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}



	public Equipe getEquipe() {
		return equipe;
	}



	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}
	

	public void EscolherPilotos(Piloto p1, Piloto p2) {
		equipe.EscolherPilotosEquipe(p1, p2);
	}
}
