package exerciciosEstruturaDecisao;

import java.util.Locale;
import java.util.Scanner;

public class ExercMediaEscolar {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite primeira nota");
		double nota1 = teclado.nextDouble();
		System.out.println("Digite segunda nota");
		double nota2 = teclado.nextDouble();
		double notaFinal = nota1 + nota2;

		if (notaFinal < 60.00) {
			System.out.printf("NOTA FINAL = %.1f%n", notaFinal);
			System.out.println("REPROVADO");
		} else {

			System.out.printf("NOTA FINAL = %.1f%n", notaFinal);
		}
		teclado.close();

	}

}
