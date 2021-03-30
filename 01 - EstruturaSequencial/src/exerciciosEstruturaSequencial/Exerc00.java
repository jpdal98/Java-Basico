package exerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exerc00 {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		double a , b , soma , sub , mult , div;
		System.out.println("Digite respectivamente os valores de A e B");
		a = teclado.nextDouble();
		b = teclado.nextDouble();
		soma = a+b;
		sub = a-b;
		mult = a*b;
		div = a/b;
		
		System.out.printf("resultado da soma de A e B é igual a: %.2f%n", a+b);
		System.out.printf("resultado da subtração de A e B é igual a: %.2f%n", a-b);
		System.out.printf("resultado da divisão de A e B é igual a: %.2f%n", a/b);
		System.out.printf("resultado da multiplicação de A e B é igual a: %.2f%n", a*b);
		System.out.println("");
		System.out.println("");
		System.out.printf("resultado da soma de A e B é igual a: %.2f%n", soma);
		System.out.printf("resultado da subtração de A e B é igual a: %.2f%n", sub);
		System.out.printf("resultado da divisão de A e B é igual a: %.2f%n", div);
		System.out.printf("resultado da multiplicação de A e B é igual a: %.2f%n", mult);
		teclado.close();

	}

}
