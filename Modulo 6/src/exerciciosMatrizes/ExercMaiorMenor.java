package exerciciosMatrizes;

import java.util.Scanner;

public class ExercMaiorMenor {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int mat[][] = new int[3][3];

		int maior = 0, menor = 0, linhaMaior = 0, colunaMaior = 0, linhaMenor = 0, colunaMenor = 0;

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.println("Digite um valor para a linha " + i + " na coluna " + j);
				mat[i][j] = teclado.nextInt();
			}

		}
		for (int i = 0; i < mat.length; i++) {
			System.out.print("[ ");
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println("]");
		}

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] > maior) {
					menor = maior;
					maior = mat[i][j];
					linhaMaior = i;
					colunaMaior = j;
				}else if(mat[i][j] < menor) {
					menor = mat[i][j];
					linhaMenor = i;
					colunaMenor = j;
				}
			}
		}
		System.out.println("O maior valor da matriz é igual a: " + maior + " esta na linha " + linhaMaior
				+ " e na coluna " + colunaMaior);
		System.out.println("O menor valor da matriz é igual a: " + menor + " esta na linha " + linhaMenor
				+ " e na coluna " + colunaMenor);
		teclado.close();

	}

}
