package exerciciosFuncoes;

import java.util.Locale;
import java.util.Scanner;

public class ExercBhaskara {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("digite o valor de a");
		int x = teclado.nextInt();
		System.out.println("digite o valor de b");
		int y = teclado.nextInt();
		System.out.println("digite o valor de c");
		int z = teclado.nextInt();

		if (x != 0) {
			double delta = delta(x, y, z);
			
			if (delta < 0) {
				System.out.println("Impossivel calcular as raizes");
				
			}
			double x1 = vertice1(x, y, delta);
			double x2 = vertice2(x, y, delta);

			System.out.printf("Delta = %.2f%n", delta);
			System.out.printf("X = %.2f%n", x1);
			System.out.printf("X' = %.2f%n", x2);
			
			teclado.close();

	}
	}

	public static double delta(int a, int b, int c) {
		double delta = Math.pow(b, 2.0) - 4 * a * c;
		return delta;
	}

	public static double vertice1(int a, int b, double delta) {
		double vertice1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		return vertice1;

	}

	public static double vertice2(int a, int b, double delta) {
		double vertice2 = (-b - Math.sqrt(delta)) / (2.0 * a);
		return vertice2;
	}
}
