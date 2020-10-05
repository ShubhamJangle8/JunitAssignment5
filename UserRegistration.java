import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
// GLOBAL CONSTANTS
	private static String NAME_REGEX = "^([A-Z]{1}[A-Za-z]{2,})$";
	private static String MOBILE_REGEX = "^([0-9]{1,4}[ ][0-9]{10})$";
	private static String EMAIL_REGEX = "^[a-zA-Z0-9_]+[-+.]?[A-Za-z0-9_]+@[A-Za-z0-9]+[.][a-z]{2,}[.]?([a-z]{2,})?$";
	private static String PASSWORD_REGEX = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[$#@!%_&])[A-Za-z0-9$#@!%_&]{8,}$";
	//validating email
	public String validateEmail(String email) {
		//String emailRegex = "^[a-zA-Z0-9_]+[-+.]?[A-Za-z0-9_]+@[A-Za-z0-9]+[.][a-z]{2,}[.]?([a-z]{2,})?$";
		if(matchingWithPattern(email, EMAIL_REGEX))
				return "valid";
		else
			return "invalid";
	}
	public String validateUserEntry(String firstName, String lastName, String mobile, String email, String password) {
		if(matchingWithPattern(firstName, NAME_REGEX) && matchingWithPattern(lastName, NAME_REGEX) && matchingWithPattern(mobile, MOBILE_REGEX)
				&& matchingWithPattern(email, EMAIL_REGEX) && matchingWithPattern(password, PASSWORD_REGEX)) {
			return "happy";
		}
		return "sad";
	}
	public boolean matchingWithPattern(String check, String regex) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(check);
		if (matcher.find()) {
			return true;
		}
		return false;
	}
}