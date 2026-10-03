import java.util.ArrayList;

public enum EquipesF1 {
    FERRARI("Scuderia Ferrari", "Italia"),
    MERCEDES("AMG Mercedes", "Alemanha"),
    RED_BULL("RedBull Racing", "Austria");

    private final String nome;
    private final String pais;
    private ArrayList<Piloto> p1 = new ArrayList(2);

    EquipesF1(String nome, String pais) {
        this.nome = nome;
        this.pais = pais;
    }

    public String getNome() {
        return nome;
    }

    public String getPais() {
        return pais;
    }

    public void addPiloto(Piloto p1){
        if(this.p1.size() < 2){
            this.p1.add(p1);
            p1.setEquipe(this);
        }
        else{
            System.out.println("Equipe: " + this.getNome() + "esta com o total de " + this.p1.size() + " pilotos");
        }
    }
}
