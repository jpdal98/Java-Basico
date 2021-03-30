package exerciciosEstruturaRepeticao;

import java.util.Scanner;

public class ExercDivisores1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("digite um numero");
		int n = teclado.nextInt();
		
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				System.out.println(i);
			}
		}
		
		
		teclado.close();
		
	}

}
