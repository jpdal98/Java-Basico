package exerciciosEstruturaDecisao;

import java.util.Scanner;

public class ExercNumParImpar {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um numero");
		int numero = teclado.nextInt();

		if (numero == 0) {
			System.out.println("Este numero � neutro");
		} else if (numero % 2 == 0) {
			System.out.println("Este numero � par");
		} else {
			System.out.println("Este numero � impar");
		}

		teclado.close();
	}

}
