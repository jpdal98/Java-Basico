package exerciciosEstruturaDecisao;

import java.util.Scanner;

public class ExercNumMaiorMenor {
		public static void main(String[] args) {
			
			Scanner teclado =  new Scanner(System.in);
			System.out.println("digite o primeiro numero");
			int num1 = teclado.nextInt();
			System.out.println("digite o segundo numero");
			int num2 = teclado.nextInt();
			System.out.println("digite o terceiro numero");
			int num3 = teclado.nextInt();
			
			if(num1 < num2 && num1 < num3) {
				System.out.println("MENOR = " + num1);
			}else if(num2 < num1 && num2 < num3) {
				System.out.println("MENOR = " + num2);
			}else if(num3 < num1 && num3 < num2) {
				System.out.println("MENOR = " + num3);
			}else if(num1 == num2 && num1 == num3 && num2 == num3) {
				System.out.println("MENOR = " + num1);
			}else{
				System.out.println("erro 404");
			}
			teclado.close();
			
		}
}
