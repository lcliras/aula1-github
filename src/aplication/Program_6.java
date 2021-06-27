package aplication;


import java.util.Scanner;
import java.text.ParseException;
import entities.Rent;

public class Program_6 {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		Rent[] vect = new Rent[10];
		
		System.out.print("How many rooms will be rented? ");
		
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			vect[room] = new Rent(name, email);
			
		}
		System.out.println();
		System.out.println("Busy rooms:");
		
		for (int i1=0; i1<10; i1++) {
			if (vect[i1] != null) {
			System.out.println(i1 + ": " + vect[i1]);
			}
		}
		sc.close();
	}
	
		
}
