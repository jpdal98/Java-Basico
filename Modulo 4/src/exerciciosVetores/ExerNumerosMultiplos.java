package exerciciosVetores;

import java.util.Scanner;

public class ExerNumerosMultiplos {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("digite o tamanho do vetor");
		int n = teclado.nextInt();
		int vet[] = new int[n];
		int cont = 0;

		for (int i = 0; i < n; i++) {
			System.out.println("Digite um valor para a posição " + i + " do vetor");
			vet[i] = teclado.nextInt();
		}

		System.out.println("");
		System.out.print("[");
		for (int i = 0; i < vet.length; i++) {
			System.out.print(" " + vet[i] + " ");

		}
		System.out.print("]");
		System.out.println("");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (vet[i] == vet[j]) {
					break;
				} else {
					if (vet[i] % vet[j] == 0) {
						cont++;
					}
				}
			}

			System.out.println("o numero na posição " + i + " do vetor possui " + cont + " numeros no vetor que são multiplos dele");

		}

		teclado.close();
	}

}
