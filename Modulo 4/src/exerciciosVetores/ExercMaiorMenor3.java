package exerciciosVetores;

import java.util.Scanner;

public class ExercMaiorMenor3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite o tamanho do vetor");
		int n = teclado.nextInt();
		int vet[] = new int[n];
		int maior = 0, menor = 0, posMaior = 0, posMenor = 0, media = 0; 
		
		for(int i = 0; i < n; i++){
			System.out.print("Digite o " +(i+1)+"� valor: ");
			vet[i] = teclado.nextInt();
			if(vet[i] > maior){ 
				maior = vet[i];
				posMaior = i;
				media += vet[i];
			}
			menor = vet[i];
		}
		media = media/n;
		for (int j = 0; j < n; j++) {
			if(vet[j] < menor){
				menor = vet[j];
				posMenor = j;
				
			}
			if(menor == vet[n-1]) {
				posMenor = n-1;
				
			}
		}
		System.out.println("");
		System.out.println("A media dos valores dentro do vetor � igual a: " + media);
		System.out.println("Maior valor dentro do vetor � igual a: "+ maior + ". ele encontra-se na posi��o " + posMaior + " do vetor");
		System.out.println("Menor valor dentro do vetor � igual a:"+ menor + ". ele encontra-se na posi��o " + posMenor + " do vetor");
		

	}

}
