package f1;

public class Equipe {
	private String nome;
	private Piloto p1;
	private Piloto p2;
	private ChefeEquipe chefe;
	private Piloto[] pilotos;
	
	
	
	
	public Equipe(String nome) {
		super();
		this.nome = nome;

	}
	public ChefeEquipe getChefe() {
		return chefe;
	}
	public void setChefe(ChefeEquipe chefe) {
		this.chefe = chefe;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Piloto getP1() {
		return p1;
	}
	public void setP1(Piloto p1) {
		this.p1 = p1;
	}
	public Piloto getP2() {
		return p2;
	}
	public void setP2(Piloto p2) {
		this.p2 = p2;
	}
	
	public void EscolherPilotosEquipe(Piloto p1, Piloto p2) {
		setP1(p1);
		setP2(p2);
	}

	

}
