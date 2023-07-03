package exerciciosVetores;

import java.util.Scanner;

public class ExercAlunosAprovados {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int soma = 0, media = 7;

		System.out.println("Coloque o numero maximo de cadastro para alunos");
		int qtdAluno = teclado.nextInt();

		String[] nome = new String[qtdAluno];
		int[] nota = new int[qtdAluno];

		for (int i = 0; i < qtdAluno; i++) {
			System.out.println("Coloque o nome do aluno nº " + i);
			nome[i] = teclado.next();

			System.out.println("Insira a Nota do Aluno nº " + i);
			nota[i] = teclado.nextInt();

			soma = soma + nota[i];
		}

		System.out.println("Alunos que tiverão nota suficiente para passar de periodo");

		for (int i = 0; i < qtdAluno; i++) {
			if (nota[i] >= media) {
				System.out.print(nome[i] + " - ");
				System.out.println(nota[i]);
			}
		}

		teclado.close();
	}

}
