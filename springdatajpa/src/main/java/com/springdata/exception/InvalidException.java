package com.springdata.exception;

public class InvalidException extends RuntimeException {

	private static final long serialVersionUID = -5624683400784605326L;
	
	
	private String message;

	public InvalidException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
