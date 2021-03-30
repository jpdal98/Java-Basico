package exerciciosFuncoes;

import java.util.Scanner;

public class ExercNumPerfeito {
	
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite um numero");
		int num = teclado.nextInt();
		
		for (int i = 2; i <= num; num--) {
		numeroPerfeito(num);
		}
		teclado.close();
		
		
	}

	public static void numeroPerfeito(int numero){
		int r = 0;
		for (int i = 2; i <= numero; i++) {
			if (numero % i == 0) {
				r += numero / i;
			}
		}
		if (r == numero) {
			System.out.println(numero + " � um numero � perfeito");
		} else {
			System.out.println(numero + " n�o � um numero � perfeito");
		}
	}
}
