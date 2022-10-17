package br.com.spring.validation;

import org.springframework.stereotype.Service;

@Service
public class NumberValidator {

	public boolean isNumeric(String strNumber) {
		
		if(strNumber == null) return false;
		
		String number = strNumber.replace(",", ".");
		return number.matches("[-+]?[0-9]*\\.?[0-9]+");
	}
}
