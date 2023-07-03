package exerciciosVetores;

import java.util.Scanner;

public class ExercInverteVetor {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o tamanho do vetor");
		int n = teclado.nextInt();
		int vet[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("Digite o " +(i+1)+"º valor: ");
			vet[i] = teclado.nextInt();
			
		}
		System.out.println("");
		
		System.out.print("[ ");
		for(int i = 0; i < n; i++) {
			System.out.print(vet[i]+" ");
		}
		System.out.println(" ]");
		System.out.println("");
		
		System.out.print("[ ");
		for(int i = n-1; i >= 0; i--) {
			System.out.print(vet[i]+" ");
		}
		
		System.out.println(" ]");
		teclado.close();

	}

}
