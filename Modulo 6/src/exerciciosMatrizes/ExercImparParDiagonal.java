package exerciciosMatrizes;

import java.util.Scanner;

public class ExercImparParDiagonal {

	public static void main(String[] args) {
		

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o tamanho das linhas e colunas da matriz");
		int n = teclado.nextInt();
		int[][] mat = new int[n][n];
		int aux = n-1;
		int par1 = 0, impar1 = 0, par2 = 0, impar2 = 0;

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

		System.out.println("diagonal principal:");
		for (int i = 0; i < mat.length; i++) {
			if(mat[i][i] % 2 == 0) {
				par1 += mat[i][i];
			}else {
				impar1 += mat[i][i];
			}
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();
		System.out.println("A soma dos numeros pares na diagonal princial é igual a:  " + par1);
		System.out.println("A soma dos numeros impares na diagonal princial é igual a:  " + impar1);
		System.out.println();
		
		System.out.println("diagonal secundaria:");
		for (int i = 0; i < mat.length; i++) {
			if(mat[i][aux] % 2 == 0) {
				par2 += mat[i][aux];
			}else {
				impar2 += mat[i][aux];
			}
			System.out.print(mat[i][aux] + " ");
			aux--;
		}
		System.out.println();
		System.out.println("A soma dos numeros pares na diagonal princial é igual a:  " + par2);
		System.out.println("A soma dos numeros impares na diagonal princial é igual a:  " + impar2);
		System.out.println();
		teclado.close();
	}

}
