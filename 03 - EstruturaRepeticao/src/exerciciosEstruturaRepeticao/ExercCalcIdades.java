package exerciciosEstruturaRepeticao;

import java.util.Scanner;

public class ExercCalcIdades {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a idade");
		int idade = teclado.nextInt();
		int cont = 0;
		int media = 0;

		if (idade < 0) {
			System.out.println("impossivel calcular!!");
		} else {
			while (idade >= 0) {
				media += idade;
				cont++;
				System.out.println("Digite a idade");
				idade = teclado.nextInt();
			}

			media = media / cont;
			System.out.println(media);

			teclado.close();
		}
	}

}
