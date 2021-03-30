package exerciciosEstruturaSequencial;

import java.util.Scanner;

public class InteracaoJoaoGabriel {

	public static void main(String[] args) {
		
		String nome;
		int idade; 
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual é o seu nome?");
		nome = teclado.nextLine();
		
		System.out.println("Olá " + nome);
		System.out.println("Quantos anos voce tem?");
		
		
		idade = teclado.nextInt();
		
		System.out.println("que legal " + nome + ", voce tem " + idade + " anos");
		
		System.out.println("Como foi seu desempenho na escola? me diga suas notas");
		
		double nota1 = teclado.nextDouble();
		double nota2 = teclado.nextDouble();
		double nota3 = teclado.nextDouble();
		double media = (nota1 + nota2 + nota3)/3; 
		System.out.println("que legal. então na nota 1 voce tirou: " + nota1 + 
				           ", na nota 2 voce tirou: " + nota2 + "e na nota 3 voce tirou: " + nota3);
		
		System.out.println("Agora vou calcular a sua media");
		System.out.println("sua media é: "  + media);
		
		teclado.close();

	}

}
