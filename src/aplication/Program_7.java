package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee_1;
import java.util.ArrayList;
import java.util.List;

public class Program_7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee_1> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		
		int N = sc.nextInt();
		
		for (int i=0; i<=N; i++) {
			System.out.println();
			System.out.println("Emplyoee #" + (i+1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			
			while(hasId(list, id)) {
				System.out.println("Id already taken! Try again:");
				id = sc.nextInt();
			}
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			
			Employee_1 emp = new Employee_1(id, name, salary);
			
			list.add(emp);
						
		}
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase : ");
		int idsalary = sc.nextInt();
		Employee_1 emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);
		//Integer pos = position(list, idsalary);
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
		//	list.get(pos).increaseSalary(percent);
			emp.increaseSalary(percent);
		}
		System.out.println();
		System.out.println("List of employees:");
		
		for (Employee_1 emp1 : list) {
			System.out.println(emp1);
		}
		sc.close();
	}
	
	private static void While(boolean hasId) {
		// TODO Auto-generated method stub
		
	}

	public static Integer position(List<Employee_1> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
	public static boolean hasId(List<Employee_1> list, int id) {
		Employee_1 emp_2 = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp_2 != null;
	}
}
