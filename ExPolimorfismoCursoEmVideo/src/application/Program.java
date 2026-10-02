package application;

import java.util.Locale;

import entities.Cachorro;
import entities.Mamifero;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Mamifero m1 = new Mamifero();
		Cachorro c1 = new Cachorro();
		
		c1.setNome("Tob");
		c1.setIdade(12);
		c1.setMembros(4);
		c1.setPeso(22);
		c1.setCorPelo("Dourado");
		
		c1.enterrarOsso();
		c1.emitirSom();
	}

}
