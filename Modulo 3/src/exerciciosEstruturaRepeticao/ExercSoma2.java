package exerciciosEstruturaRepeticao;

import java.util.Scanner;

public class ExercSoma2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um numero");
		int n = teclado.nextInt();
		int soma = 0; 
		
		for(int i = 0; i < n; i++) {
			int x = teclado.nextInt();
			soma+=x;
		
		}
		
		System.out.println(soma);
		teclado.close();
	}

}

