package entities;

public class Mamifero extends Animal{
	private String corPelo;
	
	@Override
	public void locomover() {
		System.out.println("Mamifero esta correndo");
	}
	@Override
	public void alimentar() {
		System.out.println("Esta tomando leite");
	}
	@Override
	public void emitirSom() {
		System.out.println("Som de mamifero");
	}
	public String getCorPelo() {
		return corPelo;
	}
	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
	
	
}
