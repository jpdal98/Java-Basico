package exerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exerc07 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o numero do funcionario");
		int numFunc = teclado.nextInt();
		System.out.println("Digite o numero de horas tarbalhadas");
		int horasTrab = teclado.nextInt();
		System.out.println("Digite o valor da hora trabalhada");
		double valorHorasTrab = teclado.nextDouble();
		
		double salario = horasTrab * valorHorasTrab;
		
		System.out.println("NUMBER = " + numFunc);
		System.out.printf("SALARY = US %.2f%n", salario);
		
		teclado.close();
	}

}
