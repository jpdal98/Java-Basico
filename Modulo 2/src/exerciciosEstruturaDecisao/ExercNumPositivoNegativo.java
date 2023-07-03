package exerciciosEstruturaDecisao;

import java.util.Scanner;

public class ExercNumPositivoNegativo {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um numero");
		int numero = teclado.nextInt();

		if (numero < 0) {
			System.out.println("Este numero é negativo");
		} else if (numero == 0) {
			System.out.println("este numero é neutro");
		} else {
			System.out.println("este numero é positivo");
		}

		teclado.close();
	}

}
