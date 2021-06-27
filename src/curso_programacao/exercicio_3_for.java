package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_3_for {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for (int i=0; i<N;i++) {
			double A = sc.nextDouble();
			double B = sc.nextDouble();
			double C = sc.nextDouble();
			
			double media = (((A * 2.0) + (B * 3.0) + (C * 5.0))/10);
			System.out.printf("%.1f%n ", media);
		}
		sc.close();
	}
}