package exerciciosEstruturaDecisao;

import java.util.Locale;
import java.util.Scanner;

public class ExercIntervalo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um numero");
		double num = teclado.nextDouble();

		if (num < 0.0 || num > 100.00) {
			System.out.println("Fora do intervalo!!");
		} else if (num >= 0.0 && num <= 25.00) {
			System.out.println("Este numero pertence ao intervalo [0,25]");
		} else if (num > 25.00 && num <= 50.00) {
			System.out.println("Este numero pertence ao intervalo [25,50]");
		} else if (num > 50.00 && num <= 75.00) {
			System.out.println("Este numero pertence ao intervalo [50,75]");
		} else if (num > 75.00 && num <= 100.00) {
			System.out.println("Este numero pertence ao intervalo [75,100]");
		} else {
			System.out.println("erro 404");
		}

		teclado.close();
	}
}