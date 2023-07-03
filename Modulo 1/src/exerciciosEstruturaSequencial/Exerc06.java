package exerciciosEstruturaSequencial;

import java.util.Scanner;

public class Exerc06 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("digite o valor de A");
		int A = teclado.nextInt();
		System.out.println("digite o valor de B");
		int B = teclado.nextInt();
		System.out.println("digite o valor de C");
		int C = teclado.nextInt();
		System.out.println("digite o valor de D");
		int D = teclado.nextInt();
		
		int diferenca = A*B-C*D;
		System.out.println("DIFERENCA = " + diferenca);
		
		teclado.close();
	}

}
