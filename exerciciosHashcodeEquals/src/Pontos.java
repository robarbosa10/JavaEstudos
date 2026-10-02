public enum Pontos {
    MAX("Max Verstappen", 0),
    HAMILTON("Lewis Hamilton", 0),
    NORRIS("Lando Norris", 0);

    private final String nome;
    private  int pontos;

    Pontos(String nome, int pontos){
        this.nome = nome;
        this.pontos = pontos;
    }

    public String getNome() {
        return nome;
    }

    public int getPontos() {
        return pontos;
    }

    public void AcrescentarPonto(Integer ponto){
        this.pontos = ponto;
    }
}
