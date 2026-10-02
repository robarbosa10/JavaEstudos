package br.com.estruturadedados.vetor.teste;

import br.com.estruturadedados.vetor.Vetor;

public class Aula4 {

	public static void main(String[] args) {
		// Aula 4: verifica o tamanho do vetor e imprime os valores disponiveis.
		
		Vetor vet = new Vetor(5);
		
		vet.addElemento("Deu certo!");
		vet.addElemento("uhul");
		vet.addElemento("ok");
		System.out.println(vet.tamanho());
		vet.mostrarElementos();
		vet.addElemento("legal");
		vet.mostrarElementos();
		vet.addElemento("top");
		vet.mostrarElementos();

	}

}
