package exerciciosEstruturaDecisao;

import java.util.Scanner;

public class ExercCardapio {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Cardapio:");
		System.out.println("Codigo 1 - Cachorro Quente - Pre�o: R$ 4.00");
		System.out.println("Codigo 2 - X-Salada - Pre�o: R$ 4.50");
		System.out.println("Codigo 3 - X-Bacon - Pre�o: R$ 5.00");
		System.out.println("Codigo 4 - Torrada simples - Pre�o: R$ 2.00");
		System.out.println("Codigo 5 - Refrigerante - Pre�o: R$ 1.50");
		System.out.println("Oque voce deseja pedir?");
		int codigo = teclado.nextInt();
		System.out.println("Quantos voce deseja?");
		int quantidade = teclado.nextInt();
		double total = 0;

		if (codigo == 1) {
			total = quantidade * 4.00;
		} else if (codigo == 2) {
			total = quantidade * 4.50;
		} else if (codigo == 3) {
			total = quantidade * 5.00;
		} else if (codigo == 4) {
			total = quantidade * 2.00;
		} else if (codigo == 5) {
			total = quantidade * 1.50;
		} else {
			System.out.println("Essa op��o n�o existe no cardapio");
		}

		System.out.printf("Total a pagar �:%.2f%n", total);
		teclado.close();
	}

}
