package Aula7aRelacionamentoEntreClasses;

import java.util.Random;
import java.util.random.RandomGenerator;

public class Luta {
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada = false;
	
	
	
	public Lutador getDesafiado() {
		return desafiado;
	}
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	public Lutador getDesafiante() {
		return desafiante;
	}
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	public int getRounds() {
		return rounds;
	}
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	public boolean isAprovada() {
		return aprovada;
	}
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
	public void marcarLuta() {
		if(this.getDesafiado().getCategoria() == this.getDesafiante().getCategoria() ) {
			if(this.getDesafiado() != this.getDesafiante() ) {
				System.out.printf("Luta entre %s e %s está marcada. \n", this.getDesafiado().getNome(), this.desafiante.getNome() );
				this.setAprovada(true);
			}else {
				System.out.println("Nao pode o mesmo lutador, troque!");
			}
		}else {
			System.out.println("luta nao esta marcada!");
		}
		
	}
	
	public void lutar() {
		Random rand = new Random();
		
		if(this.isAprovada() == true) {
			this.getDesafiado().apresentar();
			this.getDesafiante().apresentar();
			int vencedor = rand.nextInt(2);

			if (vencedor == 0) {
				this.getDesafiado().setEmpate(this.getDesafiado().getEmpate() + 1);
				this.getDesafiante().setEmpate(this.getDesafiante().getEmpate() + 1);
				System.out.println("Deu empate");
				System.out.printf("%s está com %d empates.\n", this.desafiado.getNome(), this.desafiado.getEmpate());
				System.out.printf("%s está com %d empates.\n", this.desafiante.getNome(), this.desafiante.getEmpate());
				
			}
			if (vencedor == 1) {
				this.getDesafiado().setVitoria(this.getDesafiado().getVitoria() + 1);
				this.getDesafiante().setDerrota(this.getDesafiante().getDerrota() + 1);
				System.out.printf("%s ganhou, agora tem: %d vitorias \n", this.getDesafiado().getNome(), this.getDesafiado().getVitoria());
				System.out.printf("%s perdeu, agora tem: %d derrotas \n", this.getDesafiante().getNome(), this.getDesafiante().getDerrota());
			}
			if (vencedor == 2) {
				this.getDesafiante().setVitoria(this.getDesafiante().getVitoria() + 1);
				this.getDesafiado().setDerrota(this.getDesafiado().getDerrota() + 1);
				System.out.printf("%s ganhou, agora tem: %d vitorias \n", this.getDesafiante().getNome(), this.getDesafiante().getVitoria());
				System.out.printf("%s perdeu, agora tem: %d derrotas \n", this.getDesafiado().getNome(), this.getDesafiado().getDerrota());
				
			}
			
		}
		
	}
	
}
