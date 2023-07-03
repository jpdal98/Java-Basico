package exerciciosEstruturaRepeticao;

import java.util.Scanner;

public class ExercNumImparPar {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um numero");
		int x = teclado.nextInt();

		if (x > 1000 || x < 0) {
			System.out.println("Numero invalido!!");
			
		} else {
			for (int i = 1; i <= x; i++) {
				if (i % 2 == 0) {
					System.out.println(i + " é Par");
					
				} else if (i % 2 == 1) {
					System.out.println(i + " é Impar");
					
				} else {
					System.out.println("Numero invalido!! digite novamente");
					x = teclado.nextInt();
				}

			}
		}

		teclado.close();

	}

}
