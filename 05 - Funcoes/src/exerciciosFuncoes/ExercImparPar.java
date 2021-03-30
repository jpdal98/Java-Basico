package exerciciosFuncoes;

import java.util.Scanner;

public class ExercImparPar {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int somaX = 0;
		int somaY = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um valor");
			int x = teclado.nextInt();
			while (x <= 0) {
				if (x <= 0) {
					System.out.println("numero invalido, digite novamente");
					x = teclado.nextInt();
				} else {
					if (impar(x)) {
						somaX += x;
					} else if (par(x)) {
						somaY += x;
					} else {
						System.out.println("Numero invalido");
					}
				}
			}
		}
		System.out.println("a soma do numeros impares é: " + somaX);
		System.out.println("a soma do numeros pares é: " + somaY);
		teclado.close();

	}

	// Função que confirma se o numero é impar
	public static boolean impar(int a) {
		if (a % 2 == 1) {
			return true;
		} else {
			return false;
		}

	}

	// Função que confirma se o numero é par
	public static boolean par(int a) {
		if (a % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

}
