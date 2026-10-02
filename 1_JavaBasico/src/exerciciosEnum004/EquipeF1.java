package exerciciosEnum004;

import java.util.ArrayList;

public enum EquipeF1 {
	FERRARI("Scuderia Ferrari", "Italia"),
	MERCEDES("AMG Mercedes", "Alemanha"),
	REDBULL("RedBull Racing", "Austria"),
	MCLAREN("Mclaren Racing", "Inglaterra");

	private final String nome;
	private final String pais;
	private ArrayList<PilotosF1> p1 = new ArrayList(2);

	EquipeF1(String nome, String pais){
		this.nome = nome;
		this.pais = pais;

	}

	public final String getNome() {
		return nome;
	}

	public final String getPais() {
		return pais;
	}

	public final ArrayList<PilotosF1> getP1() {
		return p1;
	}

	public void addPilotos(PilotosF1 piloto) {
		if(this.p1.size() < 2 ) {
			p1.add(piloto);
			piloto.AddEquipe(this);
		}
		else {
			System.out.println("Numero maximo de pilotos");
		}
	}}
