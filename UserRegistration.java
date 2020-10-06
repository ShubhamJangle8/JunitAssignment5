import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {
	public boolean validateInput (String input,String expression) {
		String regex = expression;
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		return matcher.find();
	}
	public String validateFirstName(String firstName) {
		String result = "";
		try {
			if(validateInput(firstName, "^[A-Z]{1}[a-zA-z]{2,}")) {
				result = "valid";
			}
			else {
				throw new UserRegistrationException(UserRegistrationException.invalidInputs.invalidFirstName, "Invalid User Details");
			}
		}
		catch(UserRegistrationException exception) {
			return exception.type.toString();
		}
		return result;
	}
	public String validateLastName(String lastName) {
		String result = "";
		try {
			if(validateInput(lastName, "^[A-Z]{1}[a-zA-z]{2,}")) {
				result = "valid";
			}
			else {
				throw new UserRegistrationException(UserRegistrationException.invalidInputs.invalidLastName, "Invalid User Details");
		}
		}
		catch(UserRegistrationException exception) {
			return exception.type.toString();
		}
		return result;
	}
	public String validateEmail(String email) {
		String result = "";
		try {
			if(validateInput(email, "^[a-zA-Z0-9_]+[-+.]?[A-Za-z0-9_]+@[A-Za-z0-9]+[.][a-z]{2,}[.]?([a-z]{2,})?$")) {
				result = "valid";
			}
			else {
				throw new UserRegistrationException(UserRegistrationException.invalidInputs.invalidEmail, "Invalid User Details");
			}
		}
		catch(UserRegistrationException exception) {
			return exception.type.toString();
		}
		return result;
	}
	public String validateMobileNumber(String number) {
		String result = "";
		try {
			if(validateInput(number, "^[0-9]{2}?[ ][0-9]{4,13}")) {
				result = "valid";
			}
			else {
				throw new UserRegistrationException(UserRegistrationException.invalidInputs.invalidMobileNumber, "Invalid User Details");
			}
		}
		catch(UserRegistrationException exception) {
			return exception.type.toString();
		}
		return result;
	}
	public String validatePassword(String password) {
		String result = "";
		try {
			if(validateInput(password, "^(?=.*\\d)(?=.*[A-Z])(?=.*[@$!%*?&]).{8,}$")) {
				result = "valid";
			}
			else {
				throw new UserRegistrationException(UserRegistrationException.invalidInputs.invalidPassword, "Invalid User Details");
			}
		}
		catch(UserRegistrationException exception) {
			return exception.type.toString();
		}
		return result;
	}
}