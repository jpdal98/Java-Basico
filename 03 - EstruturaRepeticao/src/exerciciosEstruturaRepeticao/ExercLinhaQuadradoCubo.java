package exerciciosEstruturaRepeticao;

import java.util.Scanner;

public class ExercLinhaQuadradoCubo {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um numero");
		int n = teclado.nextInt();
		
		
		for(int i = 1; i <= n; i++) {
			int resp1 = 0, resp2 = 0, resp3 = 0;
			resp1 = i;
			System.out.print(resp1);
			resp2 = i*i;
			System.out.print(" " + resp2);
			resp3 = i*i*i;
			System.out.println(" " + resp3);
			
		}
		
		teclado.close();

	}

}
