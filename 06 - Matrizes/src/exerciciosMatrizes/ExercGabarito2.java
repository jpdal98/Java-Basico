package exerciciosMatrizes;

import java.util.Scanner;

public class ExercGabarito2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		String nome[] = new String[3];
		String matricula[] = new String[3];
		int nota[] = new int[1];
		char resp[] = new char[10];
		char mat[][] = new char[10][5];
		char gabarito[] = new char[10];
		
		//Prova
		mat[0][0] = '0';
		mat[0][1] = 'a';
		mat[0][2] = 'b';
		mat[0][3] = 'c';
		mat[0][4] = 'd';
		mat[1][0] = '1';
		mat[1][1] = 'a';
		mat[1][2] = 'b';
		mat[1][3] = 'c';
		mat[1][4] = 'd';
		mat[2][0] = '2';
		mat[2][1] = 'a';
		mat[2][2] = 'b';
		mat[2][3] = 'c';
		mat[2][4] = 'd';
		mat[3][0] = '3';
		mat[3][1] = 'a';
		mat[3][2] = 'b';
		mat[3][3] = 'c';
		mat[3][4] = 'd';
		mat[4][0] = '4';
		mat[4][1] = 'a';
		mat[4][2] = 'b';
		mat[4][3] = 'c';
		mat[4][4] = 'd';
		mat[5][0] = '5';
		mat[5][1] = 'a';
		mat[5][2] = 'b';
		mat[5][3] = 'c';
		mat[5][4] = 'd';
		mat[6][0] = '6';
		mat[6][1] = 'a';
		mat[6][2] = 'b';
		mat[6][3] = 'c';
		mat[6][4] = 'd';
		mat[7][0] = '7';
		mat[7][1] = 'a';
		mat[7][2] = 'b';
		mat[7][3] = 'c';
		mat[7][4] = 'd';
		mat[8][0] = '8';
		mat[8][1] = 'a';
		mat[8][2] = 'b';
		mat[8][3] = 'c';
		mat[8][4] = 'd';
		mat[9][0] = '9';
		mat[9][1] = 'a';
		mat[9][2] = 'b';
		mat[9][3] = 'c';
		mat[9][4] = 'd';
		
		// gabarito : a, c, d, b, b, a, c, c, d, a
		gabarito[0] = 'a';
		gabarito[1] = 'c';
		gabarito[2] = 'd';
		gabarito[3] = 'b';
		gabarito[4] = 'b';
		gabarito[5] = 'a';
		gabarito[6] = 'c';
		gabarito[7] = 'c';
		gabarito[8] = 'd';
		gabarito[9] = 'a';

		System.out.println("Prova!!");
		System.out.println("Questões:");
		for (int i = 0; i < mat.length; i++) {
			System.out.print("[ ");
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println("]");
		}

		for (int i = 0; i < nome.length; i++) {
			System.out.println("Digite o nome do aluno");
			nome[i] = teclado.next();
			System.out.println("Digite sua matricula");
			matricula[i] = teclado.next();
			for (int j = 0; j < resp.length; j++) {
				System.out.println("Digite suas respostas");
				resp[j] = teclado.next().charAt(0);
				if(resp[j] !='a' && resp[j] !='b' && resp[j] !='c' && resp[j] !='d') {
					System.out.println("Este item não existe na questão " + j + "!! por favor digite novamente sua resposta");
					resp[j] = teclado.next().charAt(0);
				}else {
					if (resp[j] == gabarito[j]) {
						nota[i] += 1;
					}else if( resp[j] != gabarito[j]){
						nota[i] += 0;
					}
			
				}
						}
			System.out.println("");
		}
		for (int i = 0; i < nome.length; i++) {
			System.out.println("O aluno: " + nome[i] + " com a matricula: " + matricula[i] + " tirou nota " + nota[i]);
		}
		teclado.close();
	}

}
