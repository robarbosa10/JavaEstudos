package pooLoiane.Aulas28a33.ex004;

import java.util.Scanner;

public class JogoVelha {
	private String[][] jogoVelha = new String[3][3];
	private int jogada;
	private boolean continua;


	public JogoVelha() {
		this.jogada = 0;
		this.continua = false;
	}

	public String[][] getJogoVelha() {
		return jogoVelha;
	}

	public void setJogoVelha(String[][] jogoVelha) {
		this.jogoVelha = jogoVelha;
	}

	public int getJogada() {
		return jogada;
	}

	public void setJogada(int jogada) {
		this.jogada = jogada;
	}



	public boolean isContinua() {
		return continua;
	}

	public void setContinua(boolean continua) {
		this.continua = continua;
	}

	public void qtdJogada() {
		if(this.getJogada() < 9){
			this.setContinua(true);
		}
		else {
			this.setContinua(false);
			System.out.println("Jogo terminou empatado.");
		}
	}

	public void verificarMatriz() {
		for(int i = 0; i < this.getJogoVelha().length; i++) {
			System.out.print("Linha" + ": ");
			for(int j = 0; j < this.getJogoVelha()[i].length; j++) {
				if(this.getJogoVelha()[i][j] == null) {
					System.out.print("*" + "|");
				}
				else {
					System.out.print(this.getJogoVelha()[i][j] + "|");
				}


			}System.out.println();
		}
	}



	public void entradaDeDados() {
		Scanner sc = new Scanner(System.in);
		int nmrLinha = 0, nmrColuna = 0;
		System.out.println("Digite o numero da linha de 1 a 3");
		nmrLinha = sc.nextInt() -1;
		if(nmrLinha < 0 || nmrLinha > 3) {
			System.out.println("Erro, tente novamente um numero entre 1 e 3");
			nmrLinha = sc.nextInt() -1;
		}
		System.out.println("Digite o numero da coluna de 1 a 3");
		nmrColuna = sc.nextInt() -1;
		if(nmrColuna < 0 || nmrColuna > 3) {
			System.out.println("Erro, tente novamente um numero entre 1 e 3");
			nmrColuna = sc.nextInt() - 1;
		}
		if(this.getJogoVelha()[nmrLinha][nmrColuna] != null) {
			System.out.println("Erro, posição ja ocupada");

		}else {
			if(this.getJogada() %2 == 0) {
				jogoVelha[nmrLinha][nmrColuna] = "x";
				this.setJogada(getJogada() + 1);
			}
			else {
				jogoVelha[nmrLinha][nmrColuna] = "o";
				this.setJogada(getJogada() + 1);
			}
		}
		sc.close();
	}

	public void vezJogador() {
		while(isContinua() == true) {
			if(this.getJogada() % 2  == 0) {
				System.out.println("Vez do jogador 1");
				System.out.println("*---------------*");
				entradaDeDados();
				verificarMatriz();
				if (this.getJogoVelha()[0][0] == "x" && this.getJogoVelha()[0][1] == "x" && this.getJogoVelha()[0][2] == "x" ||
						this.getJogoVelha()[1][0] == "x" && this.getJogoVelha()[1][1] == "x" && this.getJogoVelha()[1][2] == "x" ||
						this.getJogoVelha()[2][0] == "x" && this.getJogoVelha()[2][1] == "x" && this.getJogoVelha()[2][2] == "x" ||
						this.getJogoVelha()[0][0] == "x" && this.getJogoVelha()[1][1] == "x" && this.getJogoVelha()[2][2] == "x")
				{
					System.out.println("jogador 1 ganhou");
					this.setContinua(false);
					break;
				}
				qtdJogada();

			}
			else {
				System.out.println("Vez do jogador 2");
				System.out.println("*---------------*");
				entradaDeDados();
				verificarMatriz();
				if (this.getJogoVelha()[0][0] == "o" && this.getJogoVelha()[0][1] == "o" && this.getJogoVelha()[0][2] == "o" ||
						this.getJogoVelha()[1][0] == "o" && this.getJogoVelha()[1][1] == "o" && this.getJogoVelha()[1][2] == "o" ||
						this.getJogoVelha()[2][0] == "o" && this.getJogoVelha()[2][1] == "o" && this.getJogoVelha()[2][2] == "o" ||
						this.getJogoVelha()[0][0] == "o" && this.getJogoVelha()[1][1] == "o" && this.getJogoVelha()[2][2] == "o")
				{
					System.out.println("jogador 2 ganhou");
					this.setContinua(false);
					break;
				}
				qtdJogada();

			}
		}
	}
}
