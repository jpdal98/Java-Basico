package exerciciosEstruturaDecisao;

import java.util.Scanner;

public class ExercNumPositivoNegativo {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um numero");
		int numero = teclado.nextInt();

		if (numero < 0) {
			System.out.println("Este numero � negativo");
		} else if (numero == 0) {
			System.out.println("este numero � neutro");
		} else {
			System.out.println("este numero � positivo");
		}

		teclado.close();
	}

}
