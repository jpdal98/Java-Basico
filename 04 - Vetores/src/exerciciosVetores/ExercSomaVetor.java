package exerciciosVetores;

import java.util.Scanner;

public class ExercSomaVetor {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o tamanho do vetor");
		int n = teclado.nextInt();
		int vet[] = new int[n];
		int soma = 0;

		for (int i = 0; i < vet.length; i++) {
			System.out.println("Digite um valor para a posição " + i + " do vetor");
			vet[i] = teclado.nextInt();
			soma += vet[i];
		}
		System.out.println("Resultado da soma dos valorres dentro do vetor é igual a: " + soma);

		teclado.close();

	}

}
