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
		System.out.println("Digite a opera��o");
		String opc = teclado.next();
		double resul;
		switch (opc) {
		case "+":
			resul = x + y;
			System.out.printf("resultado da adi��o � igual a: %.2f%n", resul);
			break;
		case "-":
			resul = x - y;
			System.out.printf("resultado da subtra��o � igual a: %.2f%n", resul);
			break;
		case "*":
			resul = x * y;
			System.out.printf("resultado da multiplica��o � igual a: %.2f%n", resul);
			break;
		case "/":
			resul = x / y;
			System.out.printf("resultado da divis�o � igual a: %.2f%n", resul);
			break;
		case "%":
			resul = x % y;
			System.out.printf("o resto da divis�o � igual a: %.2f%n", resul);
			break;
		default:
			System.out.println("opera��o invalida!!");
			break;
		}

		teclado.close();

	}

}
