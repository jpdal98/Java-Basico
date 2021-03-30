package exerciciosEstruturaDecisao;

import java.util.Scanner;

public class ExercDiaSemana {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int x = teclado.nextInt();
		String dia;
		switch (x) {
		case 1:
			dia = "domingo";
			System.out.println(dia);
			break;
		case 2:
			dia = "segunda";
			System.out.println(dia);
			break;
		case 3:
			dia = "terça";
			System.out.println(dia);
			break;
		case 4:
			dia = "quarta";
			System.out.println(dia);
			break;
		case 5:
			dia = "quinta";
			System.out.println(dia);
			break;
		case 6:
			dia = "sexta";
			System.out.println(dia);
			break;
		case 7:
			dia = "sabado";
			System.out.println(dia);
			break;
		default:
			System.out.println("Dia invalido!!");
			break;
		}
		teclado.close();

	}

}
