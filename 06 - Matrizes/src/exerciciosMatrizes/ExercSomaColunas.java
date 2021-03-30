package exerciciosMatrizes;

import java.util.Scanner;

public class ExercSomaColunas {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o numero de linhas e colunas da matriz");
		int n = teclado.nextInt();
		int mat[][] = new int[n][n];
		int soma = 0;
		

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
		
		for(int i = 0; i < mat.length; i++){
			for(int j = 0; j < mat[i].length; j++) {
				soma += mat[j][i];
			}
			System.out.println("A soma dos valores na coluna " + i +" é igual a : " + soma);
			soma = 0;
		}

		teclado.close();
	}

}
