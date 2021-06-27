package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_4_cond {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int diferenca;
		
		if (A < B ) {
			diferenca = B - A;   	
		}
		else {
			diferenca = 24 - A + B;
		}
		System.out.println("O JOGO DUROU " + diferenca + " HORA(S)");		
		sc.close();
	}
}
