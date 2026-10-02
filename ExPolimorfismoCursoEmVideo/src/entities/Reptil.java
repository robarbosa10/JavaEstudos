package entities;

public class Reptil extends Animal{
	private String corEscama;
	
	@Override
	public void locomover() {
		System.out.println("Esta se arrastando");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Esta comendo frutas");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("som de reptil");
		
	}

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
	
	 
}
