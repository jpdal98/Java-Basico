package exerciciosEstruturaDecisao;

import java.util.Locale;
import java.util.Scanner;

public class ExercPlanoLigacao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		double planoBasico = 50.00;
		System.out.println("Quantos minutos voçe ultilizou?");
		int minutos = teclado.nextInt();
		
		if(minutos <= 100) {
			System.out.printf("Valor a pagar: R$ %.2f%n", planoBasico);
		}else {
			planoBasico += (minutos-100)*2;
			System.out.printf("Valor a pagar: R$ %.2f%n", planoBasico);
		}
		
		teclado.close();
	}

}
