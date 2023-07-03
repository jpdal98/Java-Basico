package exerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);

		System.out.println("Qual a largura do terreno?");
		double largura = teclado.nextDouble();
		System.out.println("Qual o comprimento do terreno?");
		double comprimento = teclado.nextDouble();
		System.out.println("Qual o preço por metro quadrado do terreno?");
		double precoMetroQuadrado = teclado.nextDouble();
		
		double area = largura*comprimento;
		double preco = area*precoMetroQuadrado;
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);
		
		teclado.close();
		
		
	}

}
