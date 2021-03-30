package exerciciosVetores;

public class ExercRecebeVetor1 {

	public static void main(String[] args) {
		
		int A[] = {1, 0, 5, -2, -5, 7};
		int soma = A[0] + A[1] + A[5];
		A[4] = 100;
		
		System.out.print("[ ");
		for(int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.print("]");
		System.out.println("");
		System.out.println("Soma é igual a: " + soma);
	}

}
