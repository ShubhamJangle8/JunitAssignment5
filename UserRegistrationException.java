public class UserRegistrationException extends Exception {
	enum invalidInputs{
		invalidFirstName,invalidLastName,invalidEmail,invalidMobileNumber,invalidPassword;
	}
	public invalidInputs type;
	public UserRegistrationException(invalidInputs type, String message) {
		super(message);
		this.type = type;
	}
}