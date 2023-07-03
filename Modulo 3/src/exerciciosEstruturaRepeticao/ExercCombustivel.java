package exerciciosEstruturaRepeticao;

import java.util.Scanner;

public class ExercCombustivel {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o codigo do combustuvel que voce deseja");
		System.out.println("1 - Alcool");
		System.out.println("2 - Gasolina");
		System.out.println("3 - Diesel");
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		int tipo = teclado.nextInt();

		while (tipo != 4) {
			if (tipo == 1) {
				alcool += 1;

			} else if (tipo == 2) {
				gasolina += 1;

			} else if (tipo == 3) {
				diesel += 1;

			}
			System.out.println("Valor invalido!! Digite o codigo do combustivel que voce deseja");
			System.out.println("1 - Alcool");
			System.out.println("2 - Gasolina");
			System.out.println("3 - Diesel");
			tipo = teclado.nextInt();
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

		teclado.close();
	}

}
