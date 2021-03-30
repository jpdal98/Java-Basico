package exerciciosVetores;

import java.util.Scanner;

public class ExercMaiorMenor1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o tamanho do vetor");
		int n = teclado.nextInt();
		int vet[] = new int[n];
		int maior = 0, menor = 0, aux = 0;
		
		for(int i = 0; i < n; i++) {
			System.out.println("digite um valor para a posição " + i + " do vetor");
			vet[i] = teclado.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (vet[i] < vet[j]) {
					aux = vet[i];
					vet[i] = vet[j];
					vet[j] = aux;
				}
			}
		}
		System.out.println("");
		System.out.print("[");
		for (int i = 0; i < n; i++) {
			System.out.print(" " + vet[i] + " ");

		}
		System.out.print("]");
		
		maior = vet[n-1];
		menor = vet[0];
		
		System.out.println("");
		System.out.println("o maior valor do vetor é igual: " + maior);
		System.out.println("o menor valor do vetor é igual: " + menor);

		teclado.close();

	}

}
