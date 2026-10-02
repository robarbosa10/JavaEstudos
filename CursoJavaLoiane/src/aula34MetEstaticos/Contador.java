package aula34MetEstaticos;

public class Contador {
	static int contador;
	
	public static void incrementar() {
	contador ++;
	}
	public static void zerar() {
		contador = 0;
	}
	public static int valor() {
		return contador;
	}
	public static void imprimirValor() {
		System.out.println(Contador.valor());
	}
}
