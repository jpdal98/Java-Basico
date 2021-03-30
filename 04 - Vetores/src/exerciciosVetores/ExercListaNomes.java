package exerciciosVetores;

import java.util.Scanner;

public class ExercListaNomes {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.print("Entre com a quantidade de pesoas a serem cadastradas: ");
		int quant = teclado.nextInt();

		String[] num1 = new String[quant];
		String aux;
		
		for (int i = 0; i < quant ; i++) {
			System.out.println("Entre com o nome da " + (i + 1) + "ª pessoa: ");
			num1[i] = teclado.next();
		}

		for (int i = 0; i < quant - 1; i++) {
			for (int j = i + 1; j < quant ; j++) {
				if (num1[j].compareTo(num1[i]) < 0) {
					aux = num1[j];
					num1[j] = num1[i];
					num1[i] = aux;
				}
			}
		}

		System.out.println("A ordem correta é: ");

		for (int i = 0; i < quant ; i++) {
			System.out.print(num1[i]);
			if (i < quant - 1)
				System.out.print(", ");
			else
				System.out.print(".");
		}
		teclado.close();

	}

}
