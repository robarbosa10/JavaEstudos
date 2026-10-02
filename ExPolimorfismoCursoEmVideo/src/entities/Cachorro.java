package entities;

public class Cachorro extends Mamifero{
	private String nome;
	
	public void enterrarOsso() {
		System.out.println(getNome() + "enterrou o osso");
	}
	public void status() {
		System.out.println(getNome() + "esta abanando o rabo!");
	}
	@Override
	public void emitirSom() {
		System.out.println("Esta latindo");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
