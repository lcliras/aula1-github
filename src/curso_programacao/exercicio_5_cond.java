package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_5_cond {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int qtde = sc.nextInt();
		double total;
		
		if (codigo == 1 ) {
			total = qtde * 4.0;   	
		}
		else if (codigo == 2 ) {
			total = qtde * 4.5;
		}
		else if (codigo == 3 ) {
			total = qtde * 5.0;   	
		}
		else if (codigo == 4 ) {
			total = qtde * 2.0;
		}
		else {
			total = qtde * 1.5;	
		}
		System.out.printf("Total: R$ %.2f%n ", total);		
		sc.close();
	}
}
