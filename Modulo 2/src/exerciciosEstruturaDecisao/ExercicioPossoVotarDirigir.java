package exerciciosEstruturaDecisao;

import java.util.Scanner;

public class ExercicioPossoVotarDirigir {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite seu ano de nascimento");
		int anoNascimento = teclado.nextInt();
		System.out.println("Digite o ano em que estamos");
		int anoAtual = teclado.nextInt();

		if (anoAtual < anoNascimento) {
			System.out.println("valor invalido");
		}

		if (anoAtual - anoNascimento == 16) {
			System.out.println("Voce pode votar!!");
		}else if ((anoAtual - anoNascimento >= 16 && anoAtual - anoNascimento >= 18) || (anoAtual - anoNascimento == 18)) {
			System.out.println("Voce pode votar e dirigir!!"); 
		}else if (anoAtual - anoNascimento < 16 && anoAtual - anoNascimento >= 0) {
			System.out.println("Voce não pode votar e nem pode dirigir");
		}
		teclado.close();

	}

}
