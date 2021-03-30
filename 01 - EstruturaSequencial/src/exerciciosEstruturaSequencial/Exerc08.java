package exerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exerc08 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner teclado =  new Scanner(System.in);
		System.out.println("Digite o codigo da peça 1");
		int codPeca1 = teclado.nextInt();
		System.out.println("Digite o codigo da peça 2");
		int codPeca2 = teclado.nextInt();
		System.out.println("Digite a quantidade de peça 1 voce deseja comprar");
		int qtd1 = teclado.nextInt();
		System.out.println("Digite a quantidade de peça 2 voce deseja comprar");
		int qtd2 = teclado.nextInt();
		System.out.println("Digite o valor unitario da peça 1");
		double preco1 = teclado.nextDouble();
		System.out.println("Digite o valor unitario da peça 2");
		double preco2 = teclado.nextDouble();
		
		double valorTotal = qtd1*preco1 + qtd2*preco2;
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);
		
		
		
		teclado.close();
		
	}

}
