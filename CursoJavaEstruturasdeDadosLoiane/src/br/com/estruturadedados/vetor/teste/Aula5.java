package br.com.estruturadedados.vetor.teste;

import br.com.estruturadedados.vetor.Vetor;

public class Aula5 {

	public static void main(String[] args) throws Exception {
		// Estrutura de Dados e Algoritmos com Java #05: Vetores e Arrays: Obter elemento de uma posição
		
		Vetor vet = new Vetor(5);
		
		/*vet.addElemento("Deu certo!");
		vet.addElemento("uhul");
		vet.addElemento("ok");*/
		System.out.println(vet.tamanho());
		vet.mostrarElementos();
		//vet.addElemento("legal");
		vet.mostrarElementos();
		vet.addElemento("top");
		vet.mostrarElementos();
		System.out.println(vet.busca(0));

	}

}
