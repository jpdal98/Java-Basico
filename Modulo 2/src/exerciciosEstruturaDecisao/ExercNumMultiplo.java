package exerciciosEstruturaDecisao;

import java.util.Scanner;

public class ExercNumMultiplo {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o primeiro numero");
		int A = teclado.nextInt();
		System.out.println("Digite o segundo numero");
		int B = teclado.nextInt();

		if (A == 0 || B == 0) {
			System.out.println("todo numero � multiplo de zero");
		} else {
			if (A % B == 0 || B % A == 0) {
				System.out.println("S�o multiplos");
			} else {
				System.out.println("N�o s�o multiplos");
			}
		}
		teclado.close();
	}

}
