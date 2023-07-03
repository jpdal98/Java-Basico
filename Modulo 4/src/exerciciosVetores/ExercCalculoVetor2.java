package exerciciosVetores;

import java.util.Scanner;

public class ExercCalculoVetor2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o tamanho dos vetores");
		int n = teclado.nextInt();
		int vet1[] = new int[n];
		int vet2[] = new int[n];
		int soma  = 0;
		int sub = 0;
		int mult = 0;
		int div = 0;

		System.out.println("preencha o Vetor 1");
		for (int i = 0; i < n; i++) {
			System.out.println("Digite um valor para a posição " + i + " do Vetor 1");
			vet1[i] = teclado.nextInt();
			
		}
		System.out.println("");
		System.out.println("preencha o Vetor 2");
		for (int i = 0; i < n; i++) {
			System.out.println("Digite um valor para a posição " + i + " do Vetor 2");
			vet2[i] = teclado.nextInt();
			
		}
		
		System.out.println("");
		System.out.println("Vetor 1:");
		System.out.print("[");
		for (int i = 0; i < n; i++) {
			System.out.print(" " + vet1[i] + " ");

		}
		System.out.print("]");

		
		System.out.println("");
		System.out.println("Vetor 2:");
		System.out.print("[");
		for (int i = 0; i < n; i++) {
			System.out.print(" " + vet2[i] + " ");

		}
		System.out.print("]");
		System.out.println("");
		
		
		soma= vet1[0] + vet2[n-1];
		sub = vet1[0] - vet2[n-1];
		mult = vet1[0] * vet2[n-1];
		div = vet1[0] / vet2[n-1];
		
		System.out.println(soma);
		System.out.println(sub);
		System.out.println(mult);
		System.out.println(div);
		
		teclado.close();

	}

}
