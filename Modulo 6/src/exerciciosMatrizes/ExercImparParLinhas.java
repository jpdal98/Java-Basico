package exerciciosMatrizes;

import java.util.Scanner;

public class ExercImparParLinhas {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o numero de linhas e colunas da matriz");
		int n = teclado.nextInt();
		int mat[][] = new int[n][n];
		int Impar = 0, Par = 0;
		

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
				if (mat[i][j] % 2 == 0) {
					Par += mat[i][j];
				} else {
					Impar += mat[i][j];
				}
			}
			System.out.println("A soma dos numeros pares na linha " + i +" é igual a : " + Par);
			System.out.println("A soma dos numeros impares na linha " + i + " é igual a : " + Impar);
			Par = 0;
			Impar = 0;
		}
		
		
		teclado.close();
	}

}
