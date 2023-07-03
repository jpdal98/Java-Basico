package exerciciosVetores;

import java.util.Scanner;

public class ExercImparPar2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int contPar = 0, contImpar = 0;
		System.out.println("digite o tamanho do vetor");
		int n = teclado.nextInt();
		int vet[] = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("digite um valor para a posição " + i + " do vetor");
			vet[i] = teclado.nextInt();
			if (vet[i] % 2 == 1) {
				contImpar++;
			} else {
				contPar++;
			}
		}
		System.out.println("");
		System.out.print("[");
		for (int i = 0; i < vet.length; i++) {
			System.out.print(" " + vet[i] + " ");

		}
		System.out.print("]");
		System.out.println("");

		int vetImpar[] = new int[contImpar];
		int vetPar[] = new int[contPar];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < contImpar; j++) {
				if (vet[i] % 2 == 1) {
					vetImpar[j] = vet[i];
				} else {
					break;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < contPar; j++) {
				if (vet[i] % 2 == 0 ) {
					vetPar[j] = vet[i];
				} else {
					break;
				}
			}
		}

		System.out.println("");
		System.out.print("[");
		for (int i = 0; i < contImpar; i++) {
			System.out.print(" " + vetImpar[i] + " ");

		}
		System.out.print("]");
		System.out.println("");
		System.out.println("");
		System.out.print("[");
		for (int i = 0; i < contPar; i++) {
			System.out.print(" " + vetPar[i] + " ");

		}
		System.out.print("]");
		System.out.println("");

		teclado.close();
	}

}
