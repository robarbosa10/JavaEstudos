package Aula7aRelacionamentoEntreClasses;

public class Lutador implements IntLutador {
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitoria;
	private int derrota;
	private int empate;
	
	public Lutador(String nome, String nacionalidade, int idade, float altura, float peso,
			int vitoria, int derrota, int empate) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.vitoria = vitoria;
		this.derrota = derrota;
		this.empate = empate;
		if(this.peso > 50 && this.peso < 70) {
			this.categoria = "LEVE";
		}
		if(this.peso >= 70 && this.peso < 80) {
			this.categoria = "MEDIOS";
		}if(this.peso > 80) {
			this.categoria = "PESADOS";
		}
	}

	public Lutador() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getVitoria() {
		return vitoria;
	}

	public void setVitoria(int vitoria) {
		this.vitoria = vitoria;
	}

	public int getDerrota() {
		return derrota;
	}

	public void setDerrota(int derrota) {
		this.derrota = derrota;
	}

	public int getEmpate() {
		return empate;
	}

	public void setEmpate(int empate) {
		this.empate = empate;
	}

	@Override
	public void apresentar() {
		// TODO Auto-generated method stub
		System.out.println("APRESENTAÇÃO DO ATLETA");
		System.out.printf("Com: %.2f de altura. \n", this.getAltura());
		System.out.printf("Pesando: %.2fkg. \n", this.getPeso());
		System.out.printf("Nasceu no %s \n", this.getNacionalidade());
		System.out.printf("Tem %d vitorias, %d derrotas e %d empates \n", this.getVitoria(), this.getDerrota(), this.getEmpate());
		System.out.println("Ele, " + this.getNome());
		System.out.println("*-*-*-*-*-*-*-*-*-*");
	}

	@Override
	public void status() {
		// TODO Auto-generated method stub
		System.out.println("Nome: " + this.getNome());
		System.out.println("Vitoria: " + this.getVitoria());
		System.out.println("Derrota: " + this.getDerrota());
		System.out.println("empate: " + this.getEmpate());
		
	}

	@Override
	public void ganharLuta() {
		// TODO Auto-generated method stub
		this.setVitoria(this.getVitoria() + 1);
		
	}

	@Override
	public void perderLuta() {
		// TODO Auto-generated method stub
		this.setDerrota(this.getDerrota() + 1);
		
	}

	@Override
	public void empatarLuta() {
		// TODO Auto-generated method stub
		this.setEmpate(this.getEmpate() + 1);
		
	}
	
	
	
	
}
