package exerciciosEstruturaDecisao;

import java.util.Scanner;

public class ExercCardapio {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Cardapio:");
		System.out.println("Codigo 1 - Cachorro Quente - Preço: R$ 4.00");
		System.out.println("Codigo 2 - X-Salada - Preço: R$ 4.50");
		System.out.println("Codigo 3 - X-Bacon - Preço: R$ 5.00");
		System.out.println("Codigo 4 - Torrada simples - Preço: R$ 2.00");
		System.out.println("Codigo 5 - Refrigerante - Preço: R$ 1.50");
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
			System.out.println("Essa opção não existe no cardapio");
		}

		System.out.printf("Total a pagar é:%.2f%n", total);
		teclado.close();
	}

}
