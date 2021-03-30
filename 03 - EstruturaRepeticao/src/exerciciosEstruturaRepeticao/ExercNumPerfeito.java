package exerciciosEstruturaRepeticao;

import java.util.Scanner;

public class ExercNumPerfeito {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite um numero");
		int num = teclado.nextInt();
		int r = 0;

		for (int i = 2; i <= num; i++) {
			if (num % i == 0) {
				r += num / i;
			}
		}
		if (r == num) {
			System.out.println(num + " é um numero é perfeito");
		} else {
			System.out.println(num + " não é um numero é perfeito");
		}
		teclado.close();
	}
}
