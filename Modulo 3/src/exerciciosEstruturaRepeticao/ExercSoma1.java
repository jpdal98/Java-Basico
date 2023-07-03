package exerciciosEstruturaRepeticao;

import java.util.Scanner;

public class ExercSoma1 {

	public static void main(String[] args) {
	
	Scanner teclado = new Scanner(System.in);
	
	double soma = 1;
	double div = 1;
	
	for(int i = 1; i < 50; i++) {
		
		soma = (soma + 2) / ( div + 1 );
		System.out.println(soma);
	}
	
	teclado.close();
	}
}
