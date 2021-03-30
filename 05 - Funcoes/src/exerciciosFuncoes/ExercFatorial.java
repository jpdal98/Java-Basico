package exerciciosFuncoes;

import java.util.Scanner;

public class ExercFatorial {

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

				fat = fatorial(n);
				System.out.println(n + "! é igual a = " + fat);
				
				soma += fat;
				fat = 1;
				n--;
			}
			
			showFat(soma);
			teclado.close();

		}

	}
	
	//Funcão que faz o calculo do numero fatorial
	public static int fatorial(int n) {
		int aux = 1;
		for (int i = 1; i <= n; i++) {
			aux *= i;
		}
		return aux;
	}
	
	//Função que mostra a soma dos fatoriais de n ate 0
	public static void showFat(int soma) {
		System.out.println("a soma do resultado dos fatoriais é igual a: " + soma);
	}

}
