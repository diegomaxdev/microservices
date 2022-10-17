package br.com.spring.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ValorInvalidoException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ValorInvalidoException(String exception) {
		
		super(exception);
	}
}
