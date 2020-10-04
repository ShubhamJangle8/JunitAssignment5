import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationDetails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to User Registration Portal");
		UserRegistrationDetails user = new UserRegistrationDetails();
		
		System.out.println("Enter the first name");
		String firstName = sc.nextLine();
		System.out.println("Enter the last name");
		String lastName = sc.nextLine();
		System.out.println("Enter the Email Id");
		String Email = sc.nextLine();
		System.out.println("Enter the Phone Number");
		String Phone = sc.nextLine();
		System.out.println("Enter the Password");
		String Password = sc.nextLine();
		
		System.out.println(firstName + " is " +user.validateFInput(firstName)); //Validating firstName
		System.out.println(lastName + " is " +user.validateLInput(lastName)); //Validating lastName
		System.out.println(Email + " is " +user.validateEmail(Email));	// Validating Email
		System.out.println(Phone+ " is " +user.validateNumber(Phone));	// Validating Number
		System.out.println(Password+ " is " +user.validatePassword(Password));
		sc.close();
	}
	private String validateFInput(String fname) {
		String expression = "^([A-Z]{1}[A-Za-z]{2,})$"; // Pattern for Names
		Pattern pattern = Pattern.compile(expression);
		Matcher match = pattern.matcher(fname);
		if(match.find()) {
			return "valid";
		}
		return "invalid";
	}
	private String validateLInput(String lname) {
		String expression = "^([A-Z]{1}[A-Za-z]{2,})$"; // Pattern for Names
		Pattern pattern = Pattern.compile(expression);
		Matcher match = pattern.matcher(lname);
		if(match.find()) {
			return "valid";
		}
		return "invalid";
	}
	private String validateEmail(String Email) {
		String expression = "^[a-zA-Z0-9_]+[-+.]?[A-Za-z0-9_]+@[A-Za-z0-9]+[.][a-z]{2,}[.]?([a-z]{2,})?$"; // Pattern for Email
		Pattern pattern = Pattern.compile(expression);
		Matcher match = pattern.matcher(Email);
		if(match.find()) {
			return "valid";
		}
		return "invalid";
	}	
	private String validateNumber(String number) {
		String expression = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[$#@!%_&])[A-Za-z0-9$#@!%_&]{8,}$";	// Pattern for Number
		Pattern pattern = Pattern.compile(expression);
		Matcher match = pattern.matcher(number);
		if(match.find()) {
			return "valid";
		}
		return "invalid";
		
	}

	private String validatePassword(String pass) {
		String expression = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[$#@!%_&])[A-Za-z0-9$#@!%_&]{8,}$";	//Pattern for Password
		Pattern pattern = Pattern.compile(expression);
		Matcher match = pattern.matcher(pass);
		if(match.find()) {
			return "valid";
		}
		return "invalid";
	
}