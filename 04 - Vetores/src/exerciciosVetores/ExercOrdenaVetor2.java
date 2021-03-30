package exerciciosVetores;

public class ExercOrdenaVetor2 {

	public static void main(String[] args) {
		
		
		int vetor[] = { 3, 4, 7, 9 };

		int aux = 0;

		System.out.print("[");

		for (int i = 0; i < vetor.length; i++) {
			System.out.print(" " + vetor[i] + " ");
		}

		System.out.print("]");

		//Ordena o vetor em ordem decrescente
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor.length; j++) {
				if (vetor[i] > vetor[j]) {
					aux = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = aux;
				}
			}
		}
		System.out.print(" [");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(" " + vetor[i] + " ");

		}
		System.out.print("]");

	}

}
