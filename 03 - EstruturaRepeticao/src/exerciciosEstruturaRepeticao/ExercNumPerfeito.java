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
			System.out.println(num + " � um numero � perfeito");
		} else {
			System.out.println(num + " n�o � um numero � perfeito");
		}
		teclado.close();
	}
}
