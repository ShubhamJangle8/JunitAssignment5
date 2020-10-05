import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class newclassTest {
	private static UserRegistration jUnit;
	
	@BeforeAll
	static void initiate() {
		jUnit = new UserRegistration();
	}
	@Test
	public void userEntry_ifValid_shouldReturnHappy() {
		String firstName = "Shubham";
		String lastName = "Jangale";
		String mobile = "91 9987646236";
		String email = "abc.100@yahoo.com";
		String password = "shurajrek@0";
		assertEquals("happy", jUnit.validateUserEntry(firstName, lastName, mobile, email, password));
	}
	@Test
	public void userEntry_ifInvalid_shouldReturnSad() {
		String firstName = "shubham";
		String lastName = "jangale";
		String mobile = "919987646236";
		String email = "abc.100@yahoo.com.1";
		String password = "abcNn1234";
		assertEquals("sad", jUnit.validateUserEntry(firstName, lastName, mobile, email, password));
	}
	@ParameterizedTest
	@ValueSource(strings = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au",
			"abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com"})
	public void email_ifValid_shouldReturnValid(String validEmails) {
		assertEquals("valid", jUnit.validateEmail(validEmails));
		
	}
	@ParameterizedTest
	@ValueSource(strings = {"abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com", ".abc@abc.com", "abc()*.com", "abc@%*.com", 
			"abc..2002@gmail.com", "abc.@gmail.com", "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au"})
	public void email_ifInvalid_shouldReturnInvalid(String invalidEmails) {
		assertEquals("invalid", jUnit.validateEmail(invalidEmails));
		
	}
}