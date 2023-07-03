package exerciciosEstruturaDecisao;

import java.util.Scanner;

public class ExercHoraJogo {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a hora em que o jogo começou");
		int horaInicial = teclado.nextInt();
		System.out.println("Digite a hora em que o jogo terminou");
		int horaFinal = teclado.nextInt();
		int horaDia = 24;
		int duracao;

		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
			System.out.println("O jogo durou: " + duracao + " horas");

		} else {
			duracao = horaDia - (horaInicial - horaFinal);
			System.out.println("O jogo durou: " + duracao + " horas");
		}
		teclado.close();
	}

}
