package br.com.spring.math;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.spring.converter.NumberConverter;
import br.com.spring.exception.ValorInvalidoException;
import br.com.spring.validation.NumberValidator;

@Service
public class OperationsMath {

	@Autowired
	NumberValidator validar;
	
	@Autowired
	NumberConverter converter;

	public Double calcSum(String numberOne, String numberTwo) {

		if (!validar.isNumeric(numberOne) || !validar.isNumeric(numberTwo)) {
			throw new ValorInvalidoException("Favor definir um valor numérico");
		}

		Double sum = converter.convertToDouble(numberOne) + converter.convertToDouble(numberTwo);
		return sum;
	}

	public Double calcSubtract(String numberOne, String numberTwo) {

		if (!validar.isNumeric(numberOne) || !validar.isNumeric(numberTwo)) {
			throw new ValorInvalidoException("Favor definir um valor numérico");
		}

		Double subtract = converter.convertToDouble(numberOne) - converter.convertToDouble(numberTwo);
		return subtract;
	}

	public Double calcMultiply(String numberOne, String numberTwo) {

		if (!validar.isNumeric(numberOne) || !validar.isNumeric(numberTwo)) {
			throw new ValorInvalidoException("Favor definir um valor numérico");
		}

		Double multiply = converter.convertToDouble(numberOne) * converter.convertToDouble(numberTwo);
		return multiply;
	}

	public Double calcDivide(String numberOne, String numberTwo) {

		if (!validar.isNumeric(numberOne) || !validar.isNumeric(numberTwo)) {
			throw new ValorInvalidoException("Favor definir um valor numérico");
		}

		Double divide = converter.convertToDouble(numberOne) / converter.convertToDouble(numberTwo);
		return divide;
	}

	public Double calcRaiz(String number) {

		if (!validar.isNumeric(number)) {
			throw new ValorInvalidoException("Favor definir um valor numérico");
		}

		Double media = Math.sqrt(converter.convertToDouble(number));
		return media;
	}

	public Double calcMedia(String numberOne, String numberTwo, String numberThree, String numberFour,
			String numberFive) {

		if (!validar.isNumeric(numberOne) || !validar.isNumeric(numberTwo) || !validar.isNumeric(numberThree)
				|| !validar.isNumeric(numberFour) || !validar.isNumeric(numberFive)) {
			throw new ValorInvalidoException("Favor definir um valor numérico");
		}

		Double media = (converter.convertToDouble(numberOne) + converter.convertToDouble(numberTwo)
				+ converter.convertToDouble(numberThree) + converter.convertToDouble(numberFour)
				+ converter.convertToDouble(numberFive)) / 5;
		return media;
	}

	public Double calcPercent(String number, String Percent) {

		if (!validar.isNumeric(number) || !validar.isNumeric(Percent)) {
			throw new ValorInvalidoException("Favor definir um valor numérico");
		}

		Double percent = converter.convertToDouble(number) * converter.convertToDouble(Percent) / 100;
		return percent;
	}
}
