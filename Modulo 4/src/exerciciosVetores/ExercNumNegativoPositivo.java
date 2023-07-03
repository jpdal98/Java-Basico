package exerciciosVetores;

import java.util.Scanner;

public class ExercNumNegativoPositivo {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("digite o tamanho do vetor");
		int n = teclado.nextInt();
		int vet[] = new int[n];
		int cont = 0, soma = 0;
		
		for(int i = 0; i < n; i++) {
			System.out.print("Digite o " +(i+1)+"º valor: ");
			vet[i] = teclado.nextInt();
			
		}
		
		for(int i = 0; i < n; i++) {
			if(vet[i] < 0) {
				cont ++;
			}else {
				soma += vet[i];
			}
		}
		
		System.out.println("");
		
		System.out.print("[ ");
		for(int i = 0; i < n; i++) {
			System.out.print(vet[i]+" ");
		}
		System.out.println(" ]");
		System.out.println("");
		System.out.println("A quantidade de numeros negativos neste vetor é igual a: " + cont);
		System.out.println("O resultado da soma de todos os numeros positivos dentro deste vetor é igual a: " + soma);
		teclado.close();

	}

}
