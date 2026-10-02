package entities;

public class Bolsista extends Aluno {
	private int bolsa;
	
	public void renovarBolsa() {
		
	}
	
	public Bolsista () {
		
	}

	public Bolsista(int bolsa) {
		super();
		this.bolsa = bolsa;
	}

	public int getBolsa() {
		return bolsa;
	}

	public void setBolsa(int bolsa) {
		this.bolsa = bolsa;
	}
	
	
}
