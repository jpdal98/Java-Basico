package exerciciosEstruturaRepeticao;

import java.util.Scanner;

public class ExercNumIntervalo {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite quantos vezes iremos digitar");
		int n = teclado.nextInt();
		int in = 0, out = 0;

		for (int i = 0; i <= n; i++) {
			System.out.println("Digite um numero");
			int x = teclado.nextInt();
			if (x >= 10 && x <= 20) {
				in += 1;
			} else {
				out += 1;
			}
		}

		System.out.println(in + " in");
		System.out.println(out + " out");
		teclado.close();
	}

}
