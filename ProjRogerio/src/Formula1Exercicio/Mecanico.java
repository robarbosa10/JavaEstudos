package Formula1Exercicio;

public class Mecanico extends Pessoa{
	private Equipe equipe;
	private Carro carro;
	
	
	public Mecanico(Equipe equipe, Carro carro) {
		super();
		this.equipe = equipe;
		this.carro = carro;
	}

	public void montarCarro() {
		if(carro.isMontado() == false) {
			System.out.println("Montando carro...");
			carro.setMontado(true);
			System.out.println("Carro esta montando");
		}else {
			System.out.println("Carro esta desmontado.");
		}
	}
		
	public void ligarCarro() {
		if(carro.isLigado() == false && carro.isMontado() == true) {
			System.out.println("Ligando carro");
			carro.setLigado(true);
			System.out.println("Carro ligado");
		}else {
			System.out.println("Carro desligado");
		}
	
	}

	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}
}
