package exerciciosEstruturaDecisao;

import java.util.Locale;
import java.util.Scanner;

public class ExercIMC {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		double peso, altura, IMC;
		System.out.println("Digite seu peso");
		peso = teclado.nextDouble();
		System.out.println("Digite sua altura");
		peso*=1000;
		altura = teclado.nextDouble();
		IMC = peso / (altura * altura);

		if (IMC >= 0 && IMC < 18.5) {
			System.out.println("seu IMC esta abaixo do normal!!");
		} else if (IMC == 18.5 && IMC < 25) {
			System.out.println("seu IMC esta normal!!");
		} else if (IMC >= 25 && IMC < 30) {
			System.out.println("seu IMC esta indicando sobrepeso!!");
		} else if (IMC >= 30 && IMC < 35) {
			System.out.println("seu IMC esta indicando obesidade leve!!");
		} else if (IMC >= 35 && IMC < 40) {
			System.out.println("seu IMC esta indicando obesidade moderada!!");
		} else if (IMC >= 40) {
			System.out.println("seu IMC esta indicando obsidade morbida!!");
		} else {
			System.out.println("Valor invalido!!");
		}

		teclado.close();

	}

}
