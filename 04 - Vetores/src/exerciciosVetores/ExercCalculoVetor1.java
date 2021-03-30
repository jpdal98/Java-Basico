package exerciciosVetores;

import java.util.Scanner;

public class ExercCalculoVetor1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o tamanho dos vetores");
		int n = teclado.nextInt();
		int vet1[] = new int[n];
		int vet2[] = new int[n];
		int soma [] = new int[n];
		int sub [] = new int[n];
		int mult [] = new int[n];
		int div [] = new int[n];

		System.out.println("preencha o vetor1");
		for (int i = 0; i < n; i++) {
			System.out.println("Digite um valor para a posição " + i + " do vetor1");
			vet1[i] = teclado.nextInt();
			
		}
		
		System.out.println("");
		System.out.println("preencha o vetor2");
		for (int i = 0; i < n; i++) {
			System.out.println("Digite um valor para a posição " + i + " do vetor1");
			vet2[i] = teclado.nextInt();
			
		}
		//Realizando soma entre os vetores
		for(int i = 0; i < n; i++) {
			soma[i] = vet1[i] + vet2[i]; 
			
		}
		//Realizando subtração entre os vetores
		for(int i = 0; i < n; i++) {
			sub[i] = vet1[i] - vet2[i]; 
			
		}
		//Realizando multiplicação entre os vetores
		for(int i = 0; i < n; i++) {
			mult[i] = vet1[i] * vet2[i]; 
			
		}
		//Realizando divisão entre os vetores
		for(int i = 0; i < n; i++) {
			div[i] = vet1[i] / vet2[i]; 
			
		}
		//Mostrando o resultado da soma entre os vetores
		System.out.print("[");
		for (int i = 0; i < n; i++) {
			System.out.print(" " + soma[i] + " ");

		}
		System.out.print("]");
		System.out.println("");
		
		//Mostrando o resultado da subtração entre os vetores
		System.out.print("[");
		for (int i = 0; i < n; i++) {
			System.out.print(" " + sub[i] + " ");

		}
		System.out.print("]");
		System.out.println("");
		
		//Mostrando o resultado da multiplicação entre os vetores
		System.out.print("[");
		for (int i = 0; i < n; i++) {
			System.out.print(" " + mult[i] + " ");

		}
		System.out.print("]");
		System.out.println("");
		
		//Mostrando o resultado da divisão entre os vetores
		System.out.print("[");
		for (int i = 0; i < n; i++) {
			System.out.print(" " + div[i] + " ");

		}
		System.out.print("]");
		System.out.println("");
		teclado.close();
	}

}
