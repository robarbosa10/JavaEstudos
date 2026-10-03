package f1;

public class Piloto extends Pessoa {
	private int vitorias;
	private int poles;
	private boolean dirigindo;
	
	public Piloto(String nome, int idade) {
		super(nome, idade);
		this.vitorias = 0;
		this.poles = 0;
		this.dirigindo = false;
	}
	
	
}
