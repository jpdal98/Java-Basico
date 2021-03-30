package exerciciosVetores;

import java.util.Scanner;

public class ExercVetorQuadrado {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o tamanho do vetor");
		int n = teclado.nextInt();
		int vet[] = new int[n];
		int vetQuadrado[] = new int[n];
		
		for(int i = 0; i < vet.length; i++) {
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
		
		for (int i = 0; i < vet.length; i++) {
			vetQuadrado[i] = vet[i] * vet[i];
			
		}
		
		System.out.println("");
		System.out.print("[");
		for (int i = 0; i < vetQuadrado.length; i++) {
			System.out.print(" " + vetQuadrado[i] + " ");

		}
		System.out.print("]");
		teclado.close();

	}

}
