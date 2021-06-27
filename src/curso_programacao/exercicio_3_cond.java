package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_3_cond {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if ((A % B == 0) || (B % A == 0) ) {
			System.out.println("Sao multiplos");   	
		}
		else {
			System.out.println("Nao sao multiplos");	
		}
				
		sc.close();
	}
}
