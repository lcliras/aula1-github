package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class exercício_4 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		int hora = sc.nextInt();
		double valor = sc.nextDouble();
		double valor1 = hora * valor;
					
		System.out.println("NUMBER = " + number);
		System.out.printf("SALARY = U$ %.2f%n", valor1);
		
		sc.close();

	}

}
