package exerciciosFuncoes;

import java.util.Scanner;

public class ExercNumPrimo {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um valor");
		int num = teclado.nextInt();
		
		for(int i = 0; i <= num; num--) {
			numeroPrimo(num);
		}
		
		
		
		teclado.close();

	}

	public static void numeroPrimo(int numero) {
		if(numero == 1 || numero == 0) {
			System.out.println("o numero "+ numero +" não é primo");
			
		}else if (numero == 2) {
			System.out.println("o numero "+ numero +" é primo");
			
		}else {
			if(numero % 2 == 0) {
				System.out.println("o numero "+ numero +" não é primo");
				
			}else {
				System.out.println("o numero "+ numero +" é primo");
				
			}
		}
		
	}
}
