package exerciciosEstruturaDecisao;

import java.util.Scanner;

public class ExercLadoTriangulo {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		double l1, l2, l3;
		System.out.println("digite o tamanho dos lados do triangulo");
		l1 = teclado.nextDouble();
		l2 = teclado.nextDouble();
		l3 = teclado.nextDouble();

		if (l1 == l2 && l1 == l3) {
			System.out.println("Este triangulo é Equilátero");
		} else if ((l1 != l2 && l2 == l3) || (l2 != l3 && l1 == l3) || (l3 != l1 && l2 == l1)) {
			System.out.println("Este trinagulo é Isósceles");
		} else {
			System.out.println("Este triangulo é Escaleno");
		}

		teclado.close();
	}

}
