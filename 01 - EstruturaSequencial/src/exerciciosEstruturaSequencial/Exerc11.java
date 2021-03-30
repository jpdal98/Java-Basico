package exerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exerc11 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		System.out.println("digite o valor de a");
		int a = teclado.nextInt();
		System.out.println("digite o valor de b");
		int b = teclado.nextInt();
		System.out.println("digite o valor de c");
		int c = teclado.nextInt();
		
		double delta = Math.pow(b, 2.0) - 4*a*c;
		
		double x1 = (-b + Math.sqrt(delta)) / (2.0*a);
		double x2 = (-b - Math.sqrt(delta)) / (2.0*a);
		
		System.out.printf("Delta = %.2f%n", delta);
		System.out.printf("X = %.2f%n", x1);
		System.out.printf("X' = %.2f%n", x2);
		teclado.close();
	}

}
