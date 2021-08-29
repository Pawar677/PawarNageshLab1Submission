package com.greatlearing.main;
import java.util.Scanner;
import com.greatlearing.model.Employee;
import com.greatlearing.Service.CrendentialService;

public class Driver {
	private static final Scanner sc = new Scanner(System.in);
	//define main method
	public static void main (String [] args) {
		//Use scanner method to get first name, last name and department
		System.out.println("First Name : ");
		String firstName= sc.next();
		
		System.out.println("Last Name : ");
		String lastName= sc.next();
		
		System.out.println("Choose Department : ");
		System.out.println("1. Technical ");
		System.out.println("2. Admin ");
		System.out.println("3. Human Resource ");
		System.out.println("4. Legal ");
		
		int Choice = sc.nextInt();
		//Create an employee object to get details
		Employee emp;
		
		switch(Choice) {
		case 1:
		        emp = new Employee(firstName, lastName, "tech");
		        break;
		case 2:
			emp = new Employee(firstName, lastName, "adm");
			break;
		case 3:
			emp = new Employee(firstName, lastName ,"hr");
			break;
		case 4:
			emp = new Employee(firstName, lastName ,"lg");
			break;
			default:
			System.out.println("Incorrect Choice  ");
			return;
		}
		//generate email
		CrendentialService cs =new CrendentialService();
		
		String email= cs.generateEmailIAddress(emp);
		String password=cs.generatePassword();
		cs.showCredetials(emp, email, password);
		
		
	}

}
