package br.com.spring.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.spring.validation.NumberValidator;

@Service
public class NumberConverter {
	
	@Autowired
	NumberValidator validar;

	public Double convertToDouble(String strNumber) {
		if(strNumber == null) return 0d;
		String number = strNumber.replace(",", ".");
		if(validar.isNumeric(number)) return Double.parseDouble(number);
		return 0d;
	}
}
