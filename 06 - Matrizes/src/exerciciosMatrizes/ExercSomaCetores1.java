package exerciciosMatrizes;

import java.util.Scanner;

public class ExercSomaCetores1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int[][] mat = new int[3][3];
		int somaX = 0, somaY = 0;

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
		
		somaX = mat[0][1] + mat[0][2] + mat[1][2];
		somaY = mat[1][0] + mat[2][0] + mat[2][1];
		
		System.out.println();
		System.out.println("A soma dos valores acima da diagonal princial é igual a:  " + somaX);
		System.out.println("A soma dos valores abaixo da diagonal princial é igual a:  " + somaY);
		teclado.close();

	}

}
