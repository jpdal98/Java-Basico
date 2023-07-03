package exerciciosEstruturaRepeticao;

import java.util.Scanner;

public class ExercFatorial1 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o numero que voce deseja o fatorial");
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
			for (int i = 2; i <= n; i++) {
				fat *= i;
			}
			System.out.print(n + "! é igual a = " + fat);
		}
		teclado.close();
	}

}
