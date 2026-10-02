package entities;

public class Clube {
	private String nome;
	private String cidade;
	private String tecnico;
	
	
	public Clube(String nome, String cidade, String tecnico) {
		this.nome = nome;
		this.cidade = cidade;
		this.tecnico = tecnico;
	}
	public Clube(String nome, String cidade) {
		this.nome = nome;
		this.cidade = cidade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getTecnico() {
		return tecnico;
	}
	public void setTecnico(String tecnico) {
		this.tecnico = tecnico;
	}
	
}
