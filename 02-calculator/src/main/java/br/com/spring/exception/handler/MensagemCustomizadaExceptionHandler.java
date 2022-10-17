package br.com.spring.exception.handler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import br.com.spring.exception.ExceptionResponse;
import br.com.spring.exception.ValorInvalidoException;

@RestController
@RestControllerAdvice
public class MensagemCustomizadaExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(Exception.class)
	public final ResponseEntity<ExceptionResponse> handleAllException(Exception execption, WebRequest request){
			
		ExceptionResponse exceptionResponse = new ExceptionResponse(
				new Date(), 
				execption.getMessage(), 
				request.getDescription(false));
		return new ResponseEntity<>(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(ValorInvalidoException.class)
	public final ResponseEntity<ExceptionResponse> handleBadRequestException(Exception execption, WebRequest request){
			
		ExceptionResponse exceptionResponse = new ExceptionResponse(
				new Date(), 
				execption.getMessage(), 
				request.getDescription(false));
		return new ResponseEntity<>(exceptionResponse, HttpStatus.BAD_REQUEST);
	}
}
