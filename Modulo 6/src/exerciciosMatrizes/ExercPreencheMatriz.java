package exerciciosMatrizes;

import java.util.Scanner;

public class ExercPreencheMatriz {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		int n = teclado.nextInt();
		//Criando matriz com nlinhas e ncolunas
		int[][] mat = new int[n][n];

		//Preenchendo a matriz
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = teclado.nextInt();
			}

		}
		//Mostrando a matriz
		for (int i = 0; i < mat.length; i++) {
			System.out.print("[ ");
			for (int j = 0; j < mat[i].length; j++) {
				 System.out.print(mat[i][j] + " ");
			}
			System.out.println("]");
		}
		
		
		teclado.close();

	}

}
