import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class UserRegistrationTest{
	UserRegistration user = new UserRegistration();
	@Test
	public void givenFirstName_Valid_shouldReturnValid() {
		assertEquals("valid", user.validateFirstName("Shubham"));
	}
	@Test
	public void givenLastName_Valid_shouldReturnValid() {
		assertEquals("valid", user.validateLastName("Abc"));
	}
	@Test
	public void givenEmail_Valid_shouldReturnValid() {
		assertEquals("valid", user.validateEmail("abc@gmail.com"));
	}
	@Test
	public void givenMobileNumber_Valid_shouldReturnValid() {
		assertEquals("valid", user.validateMobileNumber("91 9987646236"));
	}
	@Test
	public void givenPassword_Valid_shouldReturnValid() {
		assertEquals("valid", user.validatePassword("shurajrek@0"));
	}
	@Test
	public void givenFirstName_Invalid_shouldReturnInvalid() {
		assertEquals("invalidFirstName", user.validateFirstName("S"));
	}
	@Test
	public void givenLastName_Invalid_shouldReturnInvalid() {
		assertEquals("invalidLastName", user.validateLastName("s"));
	}
	@Test
	public void givenEmail_Invalid_shouldReturnInvalid() {
		assertEquals("invalidEmail", user.validateEmail("Shubham"));
	}
	@Test
	public void givenMobileNumber_Invalid_shouldReturnInvalid() {
		assertEquals("invalidMobileNumber", user.validateMobileNumber("919987646236"));
	}
	@Test
	public void givenPassword_Invalid_shouldReturnInvalid() {
		assertEquals("invalidPassword", user.validatePassword("sh"));
	}
}