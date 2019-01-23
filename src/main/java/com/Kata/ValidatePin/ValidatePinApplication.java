package com.Kata.ValidatePin;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ValidatePinApplication {

	public static void main(String[] args) {
		SpringApplication.run(ValidatePinApplication.class, args);
	}

	public Boolean validatePin(String pin) {
		return pin.matches("^\\s{0}(\\d{4}|\\d{6})\\s{0}$");
	}

}
