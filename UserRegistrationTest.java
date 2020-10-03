class UserRegistrationDetailsTest {
	@Test
	public void givenEntry_whenAllDataValid_ReturnHappyMood() {
	
		UserRegistrationDetails obj = new UserRegistrationDetails();
	
		String fname = obj.validateFName("Shubham");
		String lname = obj.validateLName("Jangale");
		String email = obj.validateEmail("abc.xyzadff45@bl.co.in");
		String number = obj.validateNumber("919876543210");
		String password = obj.validatePassword("Qwerty@123");		
	
		assertTrue(fname == "valid" && lname == "valid" && email == "valid" && number == "valid" && password == "valid");
		System.out.println("Happy Mood");
	}
	@Test
	public void givenEntry_whenAllDataInvalid_ReturnSadMood() {
	
		UserRegistrationDetails obj = new UserRegistrationDetails();
	
		String fname = obj.validateFName("Shubha64m");
		String lname = obj.validateLName("Jang454ale");
		String email = obj.validateEmail("abc.xyzadff45@bl.co.in");
		String number = obj.validateNumber("919876543210");
		String password = obj.validatePassword("Qwerty@123");		
	
		assertTrue(fname == "valid" || lname == "valid" || email == "valid" || number == "valid" || password == "valid");
		System.out.println("Sad Mood");
	}
}