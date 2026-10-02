package exerciciosEnum001;

public enum EquipesF1 {
	FERRARI("Scuderia Ferrari", "Italia"),
	MERCEDES("Amg Mercedes", "Alemanha"),
	REDBULL("RedBull Racing", "Austria");
	
	
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
	
	
}
