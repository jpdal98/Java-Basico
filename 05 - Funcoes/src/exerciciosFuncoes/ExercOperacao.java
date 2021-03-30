package exerciciosFuncoes;

import java.util.Scanner;

public class ExercOperacao {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite dois valores:");
		double x = teclado.nextInt();
		double y = teclado.nextInt();

		System.out.println(soma(x, y));
		System.out.println(sub(x, y));
		System.out.println(mult(x, y));
		System.out.println(div(x, y));

		teclado.close();

	}
	// Funções
	public static double soma(double a, double b) {

		return a + b;
	}

	public static double sub(double a, double b) {

		return a - b;
	}

	public static double mult(double a, double b) {

		return a * b;
	}

	public static double div(double a, double b) {

		return a / b;
	}
}
