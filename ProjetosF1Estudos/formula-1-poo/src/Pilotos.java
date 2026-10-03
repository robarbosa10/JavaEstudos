public class Pilotos {
    private String nome;
    private String pais;
    private int idade;
    private int numero;
    private int corrida;
    private int poles;
    private int vitorias;
    private Equipe equipe;

    public Pilotos(String nome, String pais, int idade, int numero) {
        this.nome = nome;
        this.pais = pais;
        this.idade = idade;
        this.numero = numero;
        this.corrida = 0;
        this.poles = 0;
        this.vitorias = 0;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCorrida() {
        return corrida;
    }

    public void setCorrida(int corrida) {
        this.corrida = corrida;
    }

    public int getPoles() {
        return poles;
    }

    public void setPoles(int poles) {
        this.poles = poles;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
}
