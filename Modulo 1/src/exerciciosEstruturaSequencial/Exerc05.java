package exerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exerc05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o valor do raio");
		double raio = teclado.nextDouble();
		double PI = 3.14159;
		double area = PI * (raio*raio);
		
		System.out.printf("A= %.4f%n", area);
		
		teclado.close();
	}

}
