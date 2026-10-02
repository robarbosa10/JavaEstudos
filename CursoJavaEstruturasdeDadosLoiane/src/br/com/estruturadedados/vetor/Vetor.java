package br.com.estruturadedados.vetor;

public class Vetor {
	private String[] elementos;
	private int tamanho;
	
	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}
	//aula 3 add elemento na ultima posicao
	public boolean addElemento(String elemento) {
		if(this.tamanho < this.elementos.length) {
			this.elementos[tamanho]= elemento;
			this.tamanho ++;
			return true;
		}else {
			return false;
		}
		
		
		
	}
	//imprime valores do vetor aula 4
	public void mostrarElementos() {
		for(int i = 0; i < this.elementos.length; i++) {
			if(this.elementos[i] != null) {
				System.out.print(this.elementos[i] + "|");
			}else {
				System.out.println();
				break;
			}
		}
	}
	
	//aula 5
	public String busca(int posicao) throws Exception{
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw IllegalArgumentException("Erro, posicao invalida");
		}
		return elementos[posicao];
	}
	private Exception IllegalArgumentException(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	// verifica o tamanho aula 4
	public int tamanho() {
		return this.tamanho;
	}
}
