package exerciciosEstruturaRepeticao;

import java.util.Scanner;

public class ExercCoordenada {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("digite o primeiro valor");
		int x = teclado.nextInt();
		System.out.println("digite o segundo valor valor");
		int y = teclado.nextInt();

		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("primeiro quadrante");
			} else if (x > 0 && y < 0) {
				System.out.println("quarto quadrante");
			} else if (x < 0 && y < 0) {
				System.out.println("terceiro quadrante");
			} else if (x < 0 && y > 0) {
				System.out.println("segundo quadrante");
			}
			System.out.println("digite o primeiro valor");
			x = teclado.nextInt();
			System.out.println("digite o segundo valor valor");
			y = teclado.nextInt();
		}

		teclado.close();

	}
}
