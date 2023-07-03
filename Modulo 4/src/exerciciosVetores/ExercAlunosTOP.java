package exerciciosVetores;

import java.util.Scanner;

public class ExercAlunosTOP {

	public static void main(String[] args) {

		
		Scanner teclado = new Scanner(System.in); 
		int soma = 0, media = 0;

		System.out.println("Informe a Quantidade de Alunos que serão Cadastrados");
		int qtdaluno = teclado.nextInt();

		String[] nome = new String[qtdaluno];
		int[] nota = new int[qtdaluno];

		for (int i = 0; i < qtdaluno; i++) {
			System.out.println("Insira o Nome do Aluno nº " + i);
			nome[i] = teclado.nextLine();

			System.out.println("Insira a Nota do Aluno nº " + i);
			nota[i] = teclado.nextInt();

			soma = soma + nota[i];
		}
		media = soma / qtdaluno;

		System.out.println("Alunos c/ Nota Maior que a Média da Turma");

		for (int i = 0; i < qtdaluno; i++) {
			if (nota[i] > media) {
				System.out.print(nome[i] + " - ");
				System.out.println(nota[i]);
			}
		}

		teclado.close();
	}

}
