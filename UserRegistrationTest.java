class UserRegistrationDetailsTest {
	@Test
	void FNametest() {
		UserRegistrationDetails obj = new UserRegistrationDetails();
		String actual = obj.validateFName("Shubham");
		Assert.assertEquals("valid",actual);	
	}
}