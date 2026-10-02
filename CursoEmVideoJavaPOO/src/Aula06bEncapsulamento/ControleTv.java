package Aula06bEncapsulamento;

public class ControleTv implements Controlador{
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	public ControleTv() {
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public boolean isTocando() {
		return tocando;
	}

	public void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	@Override
	public void ligar() {
		this.setLigado(true);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void desligar() {
		// TODO Auto-generated method stub
		this.setLigado(false);
		
	}

	@Override
	public void maisVolume() {
		// TODO Auto-generated method stub
		if(this.ligado == true) {
			this.setVolume(this.getVolume() + 1);
			System.out.println("Volume atual: " + this.getVolume());
		}
		
	}

	@Override
	public void menosVolume() {
		// TODO Auto-generated method stub
		if(this.ligado) {
			this.setVolume(getVolume() - 1); 
			System.out.println("Volume atual: " + this.getVolume());
		}
		
	}

	@Override
	public void ligarMudo() {
		// TODO Auto-generated method stub
		if(this.ligado == true && this.getVolume() > 0) {
			this.setVolume(0);
			System.out.println("MUDO");
		}
		
	}

	@Override
	public void desligarMudo() {
		if(this.ligado) {
			this.setVolume(50);
			System.out.println("Volume atual: " + this.getVolume());
		}
		
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		if(this.ligado) {
			System.out.println("PLAY");
		}
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		if(this.ligado) {
			System.out.println("PAUSE");
		}
		
	}
	
	
	
}
