package exerciciosEstruturaRepeticao;

import java.util.Scanner;

public class ExercDivisores2 {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		for(int i = 1000; i <= 1999; i++) {
			if(i % 11 == 5) {
				System.out.println(i);
			}
		}
		
		
		teclado.close();

	}

}
