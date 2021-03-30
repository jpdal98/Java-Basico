package exerciciosEstruturaSequencial;

import java.util.Scanner;

public class Exerc04 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor");
		int num1 = teclado.nextInt();
		System.out.println("Digite o segundo valor");
		int num2 = teclado.nextInt();
		
		int soma = num1 + num2;
		
		System.out.println("SOMA = " + soma);
		
		teclado.close();
		
	}

}
