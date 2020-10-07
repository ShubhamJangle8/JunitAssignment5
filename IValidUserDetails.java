@FunctionalInterface
interface IValidateUserDetails {
	String validate(String check) throws UserRegistrationException;
}