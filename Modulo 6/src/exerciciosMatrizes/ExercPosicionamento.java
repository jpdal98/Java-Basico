package exerciciosMatrizes;

import java.util.Scanner;

public class ExercPosicionamento {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int m = teclado.nextInt();
		int n = teclado.nextInt();
		int[][] mat = new int[m][n];

		//preenchendo a matriz
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = teclado.nextInt();
			}
		}

		int x = teclado.nextInt();
		
		//Mostra quantas vzes o valor x se repete na matriz e mostra os valores que estão ao seu redor
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("Posição " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Esquerda: " + mat[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Acima: " + mat[i - 1][j]);
					}
					if (j < mat[i].length - 1) {
						System.out.println("Direita: " + mat[i][j + 1]);
					}
					if (i < mat.length - 1) {
						System.out.println("Abaixo: " + mat[i + 1][j]);
					}
				}
			}
		}

		teclado.close();
	}
}
