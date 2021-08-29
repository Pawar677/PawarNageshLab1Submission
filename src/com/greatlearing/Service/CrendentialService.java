package com.greatlearing.Service;
import com.greatlearing.model.Employee;
import java.util.Random;


public class CrendentialService {
	public String generateEmailIAddress(Employee emp) {
		return emp. getFirstName() + emp.getLastName().toLowerCase() + "@" + emp.getDepartmentName() + "abc.com";
		
		//generate email address and return it(Use getter and Setter to get details)
		}
	public String generatePassword() {
		Random random = new Random();
		//Generate password
		String allowedChars ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789~!@#$%^&*()+<>?";
		char [] password = new char[8];
		 for (int i=0;  i<8; i++)
		 {
			int idx= random.nextInt(allowedChars.length() ); //generate password of 0 to allowed char length
			password[i] = allowedChars.charAt(idx);
					}
		  
				return new String (password);
		}
	public void showCredetials(Employee emp, String email, String password) {
		//
		System.out.println("Dear" +emp.getFirstName() + "-here are your Credentials");
		System.out.println("Email :" + email);
		System.out.println("Password :" + password);
	}

}