package exerciciosVetores;

public class ExercOrdenaVetor1 {

	public static void main(String[] args) {

		int vetor[] = { 9, 7, 5, 2 };

		int aux = 0;

		System.out.print("[");

		for (int i = 0; i < vetor.length; i++) {
			System.out.print(" " + vetor[i] + " ");
		}

		System.out.print("]");

		//Ordena o vetor em ordem crescente
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor.length; j++) {
				if (vetor[i] < vetor[j]) {
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
