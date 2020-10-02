class UserRegistrationDetailsTest {
	@Test
	void FNametest() {
		UserRegistrationDetails obj = new UserRegistrationDetails();
		String actual = obj.validateFName("Shubham");
		Assert.assertEquals("valid",actual);	
	}
	@Test
	void LNametest() {
		UserRegistrationDetails obj = new UserRegistrationDetails();
		String actual = obj.validateLName("Shubham");	
		Assert.assertEquals("valid",actual);
	}
	@Test
	void Emailtest() {
		UserRegistrationDetails obj = new UserRegistrationDetails();
		String actual = obj.validateLName("abc.sdfg@gmail.co.in");
		Assert.assertEquals("valid",actual);
	}
	@Test
	void Numbertest() {
		UserRegistrationDetails obj = new UserRegistrationDetails();
		String actual = obj.validateNumber("91 9987646236");
		Assert.assertEquals("valid",actual);
	}
	@Test
	void Passwordtest() {
		UserRegistrationDetails obj = new UserRegistrationDetails();
		String actual = obj.validatePassword("Shubham@012");
		Assert.assertEquals("valid",actual);
		System.out.println(actual.equals("valid"));
	}
}