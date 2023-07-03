package exerciciosVetores;

import java.util.Scanner;

public class ExercImparPar1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o tamanho do vetor");
		int n = teclado.nextInt();
		int vet[] = new int[n];
		int contPar = 0, contImpar = 0;
		
		for(int i = 0; i < vet.length; i++) {
			System.out.println("Digite um valor para a posição " + i + " do vetor");
			vet[i] = teclado.nextInt();
			if(vet[i] % 2 == 0) {
				contPar += 1;
			}else {
				contImpar += 1;
			}
			
		}
		System.out.println("");
		System.out.print("[");
		for (int i = 0; i < vet.length; i++) {
			System.out.print(" " + vet[i] + " ");

		}
		System.out.print("]");
		System.out.println("");
		
		if((contImpar == 1 || contImpar == 0) && (contPar == 1 || contPar == 0)) {
			System.out.println("Este vetor possui " + contPar + " numero par ");
			System.out.println("Este vetor possui " + contImpar + " numero impar ");
		}else {
		System.out.println("Este vetor possui " + contPar + " numeros pares ");
		System.out.println("Este vetor possui " + contImpar + " numeros impares ");
		}
		teclado.close();

	}

}
