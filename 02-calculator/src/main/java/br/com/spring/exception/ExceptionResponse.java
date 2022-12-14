package br.com.spring.exception;

import java.io.Serializable;
import java.util.Date;

public class ExceptionResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private Date timeStarmp;
	private String message;
	private String details;

	public ExceptionResponse(Date timeStarmp, String message, String details) {
		super();
		this.timeStarmp = timeStarmp;
		this.message = message;
		this.details = details;
	}

	public Date getTimeStarmp() {
		return timeStarmp;
	}

	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return details;
	}
	
	

}
