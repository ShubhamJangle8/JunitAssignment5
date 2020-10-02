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
}