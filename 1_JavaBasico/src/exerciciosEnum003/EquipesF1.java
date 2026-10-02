package exerciciosEnum003;

public enum EquipesF1 {
	FERRARI("Scuderia Ferrari", "Italia"),
	MERCEDES("AMG Mercedes", "Alemanha"),
	MCLAREN("Mclaren Racing", "Inglaterra");

	private final String nome;
	private final String pais;

	EquipesF1(String nome, String pais){
		this.nome = nome;
		this.pais = pais;
	}



	public final String getNome() {
		return nome;
	}



	public final String getPais() {
		return pais;
	}



	public void isEuropeia() {
		switch (this.getPais()) {
		case "Italia": {
			System.out.println("Equipe europeia");
			break;
			}
		case "Alemanha":{
			System.out.println("Equipe europeia");
			break;
			}
		case "Inglaterra":{
			System.out.println("Equipe europeia");
			break;
			}

		}
	}
}
