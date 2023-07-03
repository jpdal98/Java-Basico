package exerciciosEstruturaDecisao;

import java.util.Scanner;

public class ExercValidaSenha {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite sua senha");
		int senha = teclado.nextInt();
		
		if(senha != 1234) {
			System.out.println("Acesso negado, Senha invalida!!");
		}else {
			System.out.println("Acesso permitido, Senha correta!!");
		}
	
		teclado.close();

	}

}
