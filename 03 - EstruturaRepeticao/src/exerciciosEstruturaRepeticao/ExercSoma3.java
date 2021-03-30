package exerciciosEstruturaRepeticao;

import java.util.Scanner;

public class ExercSoma3 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um numero");
		int num, par = 0, impar = 0;
		num = teclado.nextInt();

		while (num <= 1000) {
			if (num % 2 == 0) {
				par += num;

			} else {
				impar += num;
			}
			num = teclado.nextInt();
		}

		System.out.println("Soma dos numeros pares é igual a: " + par);
		System.out.println("Soma dos numeros impares é igual a: " + impar);
		teclado.close();

	}

}
