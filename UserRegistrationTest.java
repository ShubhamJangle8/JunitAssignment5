import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
class UserRegistrationDetailsTest {
	
	private String email;
	private String expectedValue;
	
	public UserRegistrationDetailsTest(String email, String expectedValue) {
		
		super();
		this.email = email;
		this.expectedValue = expectedValue;
	}
	
	@Before
	public void initialize() {
		UserRegistrationDetails obj = new UserRegistrationDetails();
	}
	
	public static Collection input() {
		return Arrays.asList(new Object[][] {{"abc-100@yahoo.com", "valid"}, {"abc@yahoo.com", "valid"}, {"abc.100@yahoo.com", "valid"}, 
		{"abc111@abc.com", "valid"}, {"abc-100@abc.net", "valid"}, {"abc.100@abc.com.au", "valid"}, {"abc@1.com", "valid"}, {"abc@gmail.com.com", "valid"}, 
		{"abc+100@gmail.com", "valid"}});
	}

	@Test
	public void givenSamples_whenExpectedIsTrue_returnTrue() {
		
		UserRegistrationDetails obj1 = new UserRegistrationDetails();
		
	    assertEquals(expectedValue, obj1.validateEmail(this.email));
	    
	        
    }
}