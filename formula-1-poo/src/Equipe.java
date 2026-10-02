import java.util.List;

public class Equipe {
    private String nome;
    private String pais;
    private List<Pilotos> p1;

    public Equipe(String nome, String pais) {
        this.nome = nome;
        this.pais = pais;
    }

    public void addPilotos(Pilotos pilotos){
        if(pilotos.getEquipe() == null){
            this.p1.add(pilotos);
            pilotos.setEquipe(this);
        }else {
            System.out.println("Piloto ja pertence a outra equipe.");
        }

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
