package com.Kata.ValidatePin;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ValidatePinApplicationTests {

	@Test
	public void ValidatePin_NewLine_4_Digits_Exactly_Test() {
		ValidatePinApplication application = new ValidatePinApplication();
		String pin = "1234\n";
		Boolean results = application.validatePin(pin);

		assertFalse(results);
	}

	@Test
	public void ValidatePin_4_Digits_Exactly_Test() {
		ValidatePinApplication application = new ValidatePinApplication();
		String pin = "1234";
		Boolean results = application.validatePin(pin);

		assertTrue(results);
	}

	@Test
	public void ValidatePin_6_Digits_Exactly_Test() {
		ValidatePinApplication application = new ValidatePinApplication();
		String pin = "123456";
		Boolean results = application.validatePin(pin);

		assertTrue(results);
	}

	@Test
	public void ValidatePin_LessThan4_Digits_Test() {
		ValidatePinApplication application = new ValidatePinApplication();
		String pin = "123";
		Boolean results = application.validatePin(pin);

		assertFalse(results);
	}

	@Test
	public void ValidatePin_GreaterThan6_Digits_Test() {
		ValidatePinApplication application = new ValidatePinApplication();
		String pin = "1234567";
		Boolean results = application.validatePin(pin);

		assertFalse(results);
	}

}
