package exerciciosEstruturaDecisao;

import java.util.Locale;
import java.util.Scanner;

public class ExercCalculadora {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite primeiro numero");
		double x = teclado.nextFloat();
		System.out.println("Digite segundo numero");
		double y = teclado.nextFloat();
		System.out.println("Digite a operação");
		String opc = teclado.next();
		double resul;
		switch (opc) {
		case "+":
			resul = x + y;
			System.out.printf("resultado da adição é igual a: %.2f%n", resul);
			break;
		case "-":
			resul = x - y;
			System.out.printf("resultado da subtração é igual a: %.2f%n", resul);
			break;
		case "*":
			resul = x * y;
			System.out.printf("resultado da multiplicação é igual a: %.2f%n", resul);
			break;
		case "/":
			resul = x / y;
			System.out.printf("resultado da divisão é igual a: %.2f%n", resul);
			break;
		case "%":
			resul = x % y;
			System.out.printf("o resto da divisão é igual a: %.2f%n", resul);
			break;
		default:
			System.out.println("operação invalida!!");
			break;
		}

		teclado.close();

	}

}
