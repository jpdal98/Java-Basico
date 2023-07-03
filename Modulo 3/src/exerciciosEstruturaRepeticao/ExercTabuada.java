package exerciciosEstruturaRepeticao;

import java.util.Scanner;

public class ExercTabuada {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite um numero");
		int num = teclado.nextInt();

		while (num < 1) {
			if (num < 1) {
				System.out.println("Numero invalido, digite novamente!!");
				num = teclado.nextInt();
			}
		}
		System.out.println("Tabuada");
		for (int j = 1; j <= 10; j++) {
			int r;
			System.out.println("");
			System.out.println(num  + " Adição");
			for (int i = 1; i <= 10; i++) {
				r = num + i;
				System.out.println(num + " + " + i + " = " + r);

			}
			System.out.println("");
			System.out.println(num  + " Multiplicação");
			for (int i = 1; i <= 10; i++) {
				r = num * i;
				System.out.println(num + " x " + i + " = " + r);
			}
			System.out.println("");
			num = teclado.nextInt();
		}
		teclado.close();

	}
}
