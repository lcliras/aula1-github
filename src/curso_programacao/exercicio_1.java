package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_1 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int valor1 = sc.nextInt();
		int valor2 = sc.nextInt();
		int soma = valor1 + valor2;
		System.out.println("SOMA = " + soma);
		sc.close();
	}

}
