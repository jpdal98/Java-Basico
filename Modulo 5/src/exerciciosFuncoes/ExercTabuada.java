package exerciciosFuncoes;

import java.util.Scanner;

public class ExercTabuada {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite um numero");
		int num = teclado.nextInt();

		while (num < 1) {
			if (num < 1) {
				System.out.println("Numero invalido, digite novamente!!");
				num = teclado.nextInt();
			}
		}
		System.out.println("Tabuada:");
		for (int i = 1; i <= 10; i++) {
			System.out.println("Adição:");
			adicao(num);
			System.out.println("");
			System.out.println("Multiplicação:");
			multiplicacao(num);
			System.out.println("");
			num = teclado.nextInt();
		}
		teclado.close();

	}
	
	public static void adicao(int numero){
		int resp;
		for (int i = 1; i <= 10; i++) {
			resp = numero + i;
			System.out.println(numero + " + " + i + " = " + resp);

		}	
	}
	
	public static void multiplicacao(int numero){
		int resp;
		for (int i = 1; i <= 10; i++) {
			resp = numero * i;
			System.out.println(numero + " + " + i + " = " + resp);
		}
	}

}
