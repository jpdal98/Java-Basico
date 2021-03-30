package exerciciosEstruturaRepeticao;

import java.util.Scanner;

public class ExercMaiorMenor {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int num;
		int menor = 1, maior = 0;
		for(int i = 1; i <= 5; i++) {
			
			System.out.println("Digite um numero");
			num = teclado.nextInt();
			if(menor >= num && num == 1) {
			menor = num;
			}else {
			maior = num;
			}
			
		}
		System.out.println(maior);
		System.out.println(menor);
		teclado.close();

	}

}
