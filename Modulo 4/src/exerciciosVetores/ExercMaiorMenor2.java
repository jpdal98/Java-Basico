package exerciciosVetores;

import java.util.Scanner;

public class ExercMaiorMenor2 {

	public static void main(String[] args) {
		

		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite o tamanho do vetor");
		int n = teclado.nextInt();
		int vet[] = new int[n];
		int maior = 0, menor = 0, posMaior = 0, posMenor = 0; 
		
		for(int i = 0; i < n; i++){
			System.out.print("Digite o " +(i+1)+"º valor: ");
			vet[i] = teclado.nextInt();
			if(vet[i] > maior){ 
				maior = vet[i];
				posMaior = i;
			}
			menor = vet[i];
		}
		for (int j = 0; j < n; j++) {
			if(vet[j] < menor){
				menor = vet[j];
				posMenor = j;
				
			}
			if(menor == vet[n-1]) {
				posMenor = n-1;
				
			}
		}
		System.out.println("Maior valor = "+ maior + " ele encontra-se na posição " + posMaior + " do vetor");
		System.out.println("Menor valor = "+ menor + " ele encontra-se na posição " + posMenor + " do vetor");
		
		teclado.close();
	}

}
