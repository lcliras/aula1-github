package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_2 {
	
		public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			double valor1 = sc.nextDouble();
			double area = 3.14159 * (Math.pow(valor1, 2));
						
			System.out.printf("A = %.4f%n", area);
			sc.close();

		}
}
