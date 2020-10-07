import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {
	// GLOBAL CONSTANTS
	private static String NAME_REGEX = "^([A-Z]{1}[A-Za-z]{2,})$";
	private static String MOBILE_REGEX = "^([0-9]{1,4}[ ][0-9]{10})$";
	private static String EMAIL_REGEX = "^[a-zA-Z0-9_]+[-+.]?[A-Za-z0-9_]+@[A-Za-z0-9]+[.][a-z]{2,}[.]?([a-z]{2,})?$";
	private static String PASSWORD_REGEX = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[$#@!%_&])[A-Za-z0-9$#@!%_&]{8,}$";
	
	//validating first name
	IValidateUserDetails validateFirstName = (String firstName) -> {
	if(matchingWithPattern(firstName, NAME_REGEX)) 
		return "valid"; 
	else
		throw new UserRegistrationException("Invalid first name");
	};
	
	//Validating last name
	IValidateUserDetails validateLastName = (String lastName) -> {
	if(matchingWithPattern(lastName, NAME_REGEX)) 
		return "valid"; 
	else
		throw new UserRegistrationException("Invalid first name");
	};
		
	//validating email
	IValidateUserDetails validateEmail = (String email) -> {
		if(matchingWithPattern(email, EMAIL_REGEX))
				return "valid";
		else
			throw new UserRegistrationException("Invalid email");
	};
	
	//validating mobile
	IValidateUserDetails validateMobileNumber = (String mobile) -> {
		if(matchingWithPattern(mobile, MOBILE_REGEX))
			return "valid";
		else
			throw new UserRegistrationException("Invalid mobile number");
	};
	
	//validating password
	IValidateUserDetails validatePassword = (String password) -> {
		if(matchingWithPattern(password, PASSWORD_REGEX))
			return "valid";
		else
			throw new UserRegistrationException("Invalid password");
	};
	
	// checking for match
	public boolean matchingWithPattern(String check, String regex) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(check);
		if (matcher.find()) {
			return true;
		}
		return false;
	}
}