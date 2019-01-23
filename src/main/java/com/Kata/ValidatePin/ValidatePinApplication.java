package com.Kata.ValidatePin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ValidatePinApplication {

	public static void main(String[] args) {
		SpringApplication.run(ValidatePinApplication.class, args);
	}

	public Boolean validatePin(String pin) {
		return pin.matches("^\\d{4}|\\d{6}$");
	}

}
