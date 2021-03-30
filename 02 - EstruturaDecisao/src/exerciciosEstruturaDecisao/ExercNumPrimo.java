package exerciciosEstruturaDecisao;

import java.util.Scanner;

public class ExercNumPrimo {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("digite um numero");
		int num = teclado.nextInt();

		if (num == 1 || num == 0) {
			System.out.println("o numero " + num + " não é primo");
		} else if (num == 2) {
			System.out.println("o numero " + num + " é primo");
		} else {
			if (num % 2 == 0) {
				System.out.println("o numero " + num + " não é primo");
			} else {
				System.out.println("o numero " + num + " é primo");
			}
		}

		teclado.close();

	}

}
