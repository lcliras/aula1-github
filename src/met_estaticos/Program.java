package met_estaticos;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dolllar price? ");
		double dollarPrice = sc.nextDouble();
		System.out.print("How many dollars will be baught?" );
		double amount = sc.nextDouble();
		double result = util.dollarToReal(amount, dollarPrice);
		System.out.printf("Amount to be paid in result = %.2f%n", result);
		
		sc.close();
	}

}
