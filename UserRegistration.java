import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to User Registration Portal");
		UserRegistration user = new UserRegistration();
		
		System.out.println("Enter the first name");
		String firstName = sc.nextLine();
		System.out.println("Enter the last name");
		String lastName = sc.nextLine();
		
		System.out.println(firstName + " is " +user.validateFInput(firstName)); //Validating firstName
		System.out.println(lastName + " is " +user.validateLInput(lastName)); //Validating lastName
		sc.close();
	}
	private String validateFInput(String fname) {
		String expression = "(^[A-Z]{1})[a-z]{2,}$"; // Pattern for Names
		Pattern pattern = Pattern.compile(expression);
		Matcher match = pattern.matcher(fname);
		if(match.find()) {
			return "valid";
		}
		return "invalid";
	}
	private String validateLInput(String lname) {
		String expression = "(^[A-Z]{1})[a-z]{2,}$"; // Pattern for Names
		Pattern pattern = Pattern.compile(expression);
		Matcher match = pattern.matcher(lname);
		if(match.find()) {
			return "valid";
		}
		return "invalid";
	}
}