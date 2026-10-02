package exerciciosEnum004;

import exerciciosEnum001.EquipesF1;

public class Main {

	public static void main(String[] args) {
		/*4. Criar uma classe Piloto que usa o enum
				Crie uma classe Piloto com os seguintes atributos:
					 nome (String)
					 Pais (String)
					 equipe (EquipeF1 - enum)
				No main, crie uma lista de pilotos e imprima seus dados assim:
				Nome: Max Verstappen, Pais: Holanda, Equipe: RED_BULL*/
		
		EquipeF1.FERRARI.addPilotos(PilotosF1.HAMILTON);
		EquipeF1.FERRARI.addPilotos(PilotosF1.LECLERC);
		EquipeF1.MERCEDES.addPilotos(PilotosF1.KIMI);
		EquipeF1.MERCEDES.addPilotos(PilotosF1.RUSSEL);
		EquipeF1.REDBULL.addPilotos(PilotosF1.MAX);
		EquipeF1.REDBULL.addPilotos(PilotosF1.TSUNODA);
		
		
		
		for(PilotosF1 piloto : PilotosF1.values()) {
			System.out.println("Piloto: " + piloto.getNome() + " - Equipe: " + piloto.getEquipe().getNome());
		}
		System.out.println("******************");
		
		for(EquipeF1 e1 : EquipeF1.values()) {
			if(e1.name() == "REDBULL") {
				System.out.println(e1.getP1());	
			}
			
		}
	}

}
