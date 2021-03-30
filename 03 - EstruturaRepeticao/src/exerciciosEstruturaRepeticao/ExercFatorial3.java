package exerciciosEstruturaRepeticao;

import java.util.Scanner;

public class ExercFatorial3 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um numero");
		int n = teclado.nextInt();
		int fat = 1;
		int soma = 0;
		
		
		while (n < 0) {
			if (n < 0) {
				System.out.println("Numero invalido, digite novamente!!");
				n = teclado.nextInt();
			}
		}
		// caso base
		if (n == 1 || n == 0) {
			System.out.println(n + "! é igual a = " + fat);

		} else {
			for (int i = n; i >= 0; i--) {
				for (int j = 1; j <= n; j++) {
					fat *= j;
				}
				
				System.out.println(n + "! é igual a = " + fat);
				soma += fat;
				fat = 1;
				n--;
			}
			System.out.println("a soma do resultado dos fatoriais é igual a: " + soma);
			teclado.close();

		}
	}

}
