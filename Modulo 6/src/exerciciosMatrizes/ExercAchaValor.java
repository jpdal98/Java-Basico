package exerciciosMatrizes;

import java.util.Scanner;

public class ExercAchaValor {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int mat[][] = new int[3][3];

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

		System.out.println("Digite o valor que voce deseja verificar se existe na matriz");
		int x = teclado.nextInt();

		for (int i = 0; i < mat.length; i++) {
			int linha = 0, coluna = 0;
			for (int j = 0; j < mat[i].length; j++) {
				if (x == mat[i][j]) {
					linha = i;
					coluna = j;
					System.out.println("o valor que voce procura esta localizado na linha " + i + " na coluna " + j);
				}

			}
			if (i < mat.length) {
				System.out.println("Este numero não existe dentro da matriz!!");
				break;
			}
		}

		teclado.close();
	}

}
