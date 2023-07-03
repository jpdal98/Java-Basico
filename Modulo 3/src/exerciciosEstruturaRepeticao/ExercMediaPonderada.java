package exerciciosEstruturaRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class ExercMediaPonderada {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.println("Digite a primeira nota");
			double a = sc.nextDouble();
			System.out.println("Digite a segunda nota");
			double b = sc.nextDouble();
			System.out.println("Digite a terceira nota");
			double c = sc.nextDouble();

			double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

			System.out.printf("sua media é: %.1f%n", media);
			System.out.printf("%.1f%n", media);
		}

		sc.close();
	}
}