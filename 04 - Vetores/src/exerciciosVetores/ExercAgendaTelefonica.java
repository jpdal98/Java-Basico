package exerciciosVetores;

import java.util.Scanner;

public class ExercAgendaTelefonica {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Quantas pessoas serão salvas na sua agenda de contato?");
		int n = teclado.nextInt();
		String tel[]= new String[n];
		String nome[] = new String[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Digite o nome da pessoa " + (1 + i));
			nome[i] = teclado.next();
			System.out.println("Digite o numero da pessoa" + (1 + i));
			tel[i] = teclado.next();
		}
		
		String buscadenome;
		System.out.println("Digite o nome do cliente.");
		buscadenome = teclado.next();
		boolean inesistente = true;
		for (int i = 0; i < n; i++) {
			if (buscadenome.equals(nome[i])) {
				System.out.println(nome[i]);
				System.out.println(tel[i]);
				inesistente = false;
			}
		}

		if (inesistente) {
			System.out.println("Nome inexistente");
		}
		teclado.close();
	}

}
