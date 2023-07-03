package exerciciosVetores;

import java.util.Scanner;

public class ExercEliminaRepetido {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o tamanho do vetor");
		int n = teclado.nextInt();
		int vet[] = new int[n];
		int aux = n - 1; // ultima posição do vetor

		for (int i = 0; i < n; i++) {
			System.out.print("Digite o " + (i + 1) + "º valor: ");
			vet[i] = teclado.nextInt();

		}

		System.out.println("");

		System.out.print("[ ");
		for (int i = 0; i < n; i++) {
			System.out.print(vet[i] + " ");
		}
		System.out.println(" ]");
		System.out.println("");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (n == 1 ) {
					break;
				} else {
					if (i == n-1) {
						if (vet[n-1] != vet[i]) {
							break;
						} else if (vet[n-1] == vet[i]){
							if(vet[n-1] != vet[j]) {
							vet[i] = 0;
							break;
							}else {
								break;
							}
						}else {
							break;
						}
					} else {
						if (vet[i] == vet[j + 1]) {
							vet[i] = 0;
							break;
						}
					}
				}
			}
		}
		System.out.print("[ ");
		for (int i = 0; i < n; i++) {
			System.out.print(vet[i] + " ");
		}
		System.out.println(" ]");
		System.out.println("");

		teclado.close();

	}

}
