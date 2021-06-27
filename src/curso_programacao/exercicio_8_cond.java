package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_8_cond {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		double IR;
		
				
		if (salario <= 2000.00 ) {
			IR = 0;  	   	
		}
		else if (salario <= 3000.00) {
			IR = ((salario - 2000.00) * 0.08); 
		}
		else if (salario <= 4500.00)  {
			IR = ((salario - 3000.00) * 0.18) + (1000.00 * 0.08);   	
		}
		else {
			IR = ((salario - 4500.00) * 0.28) + (1500.00 * 0.18) + (1000.00 * 0.08); 	
		}
		if (IR == 0) {
			System.out.println("Isento");	
		}
		else {
		System.out.printf("Saida: R$ %.2f%n ", IR); 
		}
		sc.close(); 
	}
}
