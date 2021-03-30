package exerciciosMatrizes;

import java.util.Scanner;

public class ExercSomaDiagonais {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o tamanho das linhas e colunas da matriz");
		int n = teclado.nextInt();
		int[][] mat = new int[n][n];
		int aux = n-1;
		int somad1 = 0, somad2 = 0;

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
			System.out.print(mat[i][i] + " ");
			somad1 += mat[i][i];
		}
		System.out.println();
		System.out.println("A soma dos valores na diagonal princial é igual a:  " + somad1);
		System.out.println();
		
		System.out.println("diagonal final:");
		for (int i = 0; i < mat.length; i++) {
				somad2 += mat[i][aux];
			System.out.print(mat[i][aux] + " ");
			aux--;
		}
		System.out.println();
		System.out.println("A soma dos valores na diagonal princial é igual a:  " + somad2);
		System.out.println();
		teclado.close();

	}
}
