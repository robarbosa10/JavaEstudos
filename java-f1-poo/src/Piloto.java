public enum Piloto {
    HAMILTON("Lewis Hamilton", "Inglaterra", 41, 44),
    LECLERC("Charles Leclerc", "Monaco", 28, 55),
    RUSSEL("George Russel", "Inglaterra", 28, 63),
    MAX("Max Verstappen", "Holanda", 29, 3),
    HADJAR("Isack Hadjar", "Franca", 21, 6),
    KIMI("Kimi Antonelli", "Italia", 19, 12);

    private final String nome;
    private final String pais;
    private int idade;
    private int numeroCarro;
    private EquipesF1 equipe;

    Piloto(String nome, String pais, int idade, int numeroCarro) {
        this.nome = nome;
        this.pais = pais;
        this.idade = idade;
        this.numeroCarro = numeroCarro;
        this.equipe = null;
    }

    public String getNome() {
        return nome;
    }

    public String getPais() {
        return pais;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumeroCarro() {
        return numeroCarro;
    }

    public void setNumeroCarro(int numeroCarro) {
        this.numeroCarro = numeroCarro;
    }

    public EquipesF1 getEquipe() {
        return equipe;
    }

    public void setEquipe(EquipesF1 equipe) {
        this.equipe = equipe;
    }
}
