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
	void Emailtest1() {
		UserRegistrationDetails obj = new UserRegistrationDetails();
		String actual = obj.validateLName("abc@gmail.com");
		Assert.assertEquals("valid",actual);
	}
	@Test
	void Emailtest2() {
		UserRegistrationDetails obj = new UserRegistrationDetails();
		String actual = obj.validateLName("abc-100@yahoo.com");
		Assert.assertEquals("valid",actual);
	}
	@Test
	void Emailtest3() {
		UserRegistrationDetails obj = new UserRegistrationDetails();
		String actual = obj.validateLName("abc.100@yahoo.com");
		Assert.assertEquals("valid",actual);
	}
	@Test
	void Emailtest4() {
		UserRegistrationDetails obj = new UserRegistrationDetails();
		String actual = obj.validateLName("abc-100@abc.net");
		Assert.assertEquals("valid",actual);
	}
	@Test
	void Emailtest5() {
		UserRegistrationDetails obj = new UserRegistrationDetails();
		String actual = obj.validateLName("abc.100@abc.com.au");
		Assert.assertEquals("valid",actual);
	}
	@Test
	void Emailtest6() {
		UserRegistrationDetails obj = new UserRegistrationDetails();
		String actual = obj.validateLName("abc@gmail.com.com");
		Assert.assertEquals("valid",actual);
	}
	@Test
	void Emailtest7() {
		UserRegistrationDetails obj = new UserRegistrationDetails();
		String actual = obj.validateLName("abc@.com.my");
		Assert.assertEquals("valid",actual);
	}
	@Test
	void Emailtest8() {
		UserRegistrationDetails obj = new UserRegistrationDetails();
		String actual = obj.validateLName("abc123@gmail.a");
		Assert.assertEquals("valid",actual);
	}
	@Test
	void Emailtest9() {
		UserRegistrationDetails obj = new UserRegistrationDetails();
		String actual = obj.validateLName("abc123@.com");
		Assert.assertEquals("valid",actual);
	}
	
	@Test
	void Emailtest10() {
		UserRegistrationDetails obj = new UserRegistrationDetails();
		String actual = obj.validateLName(".abc@abc.com");
		Assert.assertEquals("valid",actual);
	}
	
	@Test
	void Emailtest11() {
		UserRegistrationDetails obj = new UserRegistrationDetails();
		String actual = obj.validateLName("abc()*@gmail.com");
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
		String actual = obj.validatePassword("Shubham!012");
		Assert.assertEquals("valid",actual);
		System.out.println(actual.equals("valid"));
	}
}