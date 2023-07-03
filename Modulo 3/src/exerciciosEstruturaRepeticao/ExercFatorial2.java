package exerciciosEstruturaRepeticao;

import java.util.Scanner;

public class ExercFatorial2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o numero que vc deseja o fatorial");
		int n = teclado.nextInt();
		int fat = 1;

		while (n < 0) {
			if (n < 0) {
				System.out.println("Numero invalido, digite novamente!!");
				n = teclado.nextInt();
			}
		}

		if (n == 1 || n == 0) {
			System.out.println(n + "! é igual a = " + fat);

		} else {
			for (int i = 1; i <= 100; i++) {
				for (int j = 1; j <= n; j++) {
					fat *= j;
				}
				System.out.println(n + "! é igual a = " + fat);
				n = teclado.nextInt();
				fat = 1;
			}
			teclado.close();
		}

	}

}
