package exerciciosEstruturaRepeticao;

import java.util.Scanner;

public class ExercNumPrimo {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("digite um numero");
		int num = teclado.nextInt();

		for (int i = 0; i <= num; i++) {

			if (i == 1 || i == 0) {
				System.out.println("o numero " + i + " não é primo");
			} else if (i == 2) {
				System.out.println("o numero " + i + " é primo");
			} else {
				if (i % 2 == 0) {
					System.out.println("o numero " + i + " não é primo");
				} else {
					System.out.println("o numero " + i + " é primo");
				}
			}
		}
		teclado.close();
	}

}
