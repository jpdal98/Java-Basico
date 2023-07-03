package exerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exerc09 {

public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		System.out.println("digite o valor de A");
		double A = teclado.nextDouble();
		System.out.println("digite o valor de B");
		double B = teclado.nextDouble();
		System.out.println("digite o valor de C");
		double C = teclado.nextDouble();
		
		double PI = 3.14159;
		double areaTriangulo = (A*C)/2;
		double areaRetangulo = A*B;
		double areaCirculo = PI*(C*C);
		double areaQuadrado = B*B;
		double areaTrapezio = ((A+B)*C)/2;
		
		System.out.printf("TRINAGULO: %.3f%n", areaTriangulo );
		System.out.printf("CIRCULO: %.3f%n", areaCirculo);
		System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
		System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
		System.out.printf("RENTANGULO: %.3f%n", areaRetangulo);
		teclado.close();
	}
}
