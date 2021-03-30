package exerciciosEstruturaSequencial;
import java.util.Locale;

public class Exerc01 {

	public static void main(String[] args) {
	
		int y = 32;
		double x = 10.568976;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println("Bom dia!!");
		System.out.printf("%.2f%n",x);
		System.out.printf("%.4f%n",x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n",x);
	}

}
