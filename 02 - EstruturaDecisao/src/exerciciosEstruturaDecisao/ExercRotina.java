package exerciciosEstruturaDecisao;

import java.util.Scanner;

public class ExercRotina {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Deseja prosseguir?");
		char r = teclado.next().charAt(0);
		if (r == 's') {
			System.out.println("Qual a hora?");
			int hora = teclado.nextInt();

			if (hora <= 12) {
				System.out.println("bom dia!!");
				if (hora == 6) {
					System.out.println("hora de acordar e tomar o café da manhã!!");
				}
				if (hora == 7) {
					System.out.println("hora de trabalhar!!");
				}
				if (hora == 12) {
					System.out.println("hora de almoçar!!");
				}
			} else if (hora >= 13 || hora < 18) {
				System.out.println("bom tarde!!");
				if (hora == 13) {
					System.out.println("hora de voltar ao trabalho!!");
				}
				if (hora == 15) {
					System.out.println("hora de merendar!!");
				}
				if (hora == 17) {
					System.out.println("hora de sair do trabalho e voltar para casa!!");
				}
			} else if (hora >= 18 || hora <= 24) {
				System.out.println("bom noite!!");
				if (hora >= 18 || hora < 22) {
					System.out.println("hora do jantar!!");
				}
				if (hora >= 22 || hora <= 24) {
					System.out.println("hora de relaxar e descansar!!");
				}
			} else {
				System.out.println("voce esta em um limbo sem fim");
			}

		} else if (r == 'n') {
			System.out.println("ok!!");
		} else {
			System.out.println("essa opção é invalida!!");
		}
		teclado.close();
	}

}
