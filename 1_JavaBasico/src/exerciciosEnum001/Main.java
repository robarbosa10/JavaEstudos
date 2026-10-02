package exerciciosEnum001;

public class Main {

	public static void main(String[] args) {
		/*� Exercícios com Fórmula 1 (enum com Equipes)
			1. Criar um enum com 6 equipes de F1
				Crie um enum chamado EquipeF1 com 3 equipes. Cada equipe deve ter:
				 Nome completo
				 País de origem
				Implemente getters para cada campo.
			2. Mostrar todas as equipes e seus dados
				Crie um main que percorre todas as equipes e imprime:
				Nome: Ferrari, País: Itália*/
		
		for(EquipesF1 e1 : EquipesF1.values()) {
			System.out.println("Nome: " + e1.getNome() + " - Pais: " + e1.getPais());
		}

	}

}
