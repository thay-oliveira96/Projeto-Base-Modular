package br.com.trosoftware.services.exceptions;

public class ObjectnotFoundExcption extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ObjectnotFoundExcption(String message, Throwable cause) {
		super(message, cause);
	}

	public ObjectnotFoundExcption(String message) {
		super(message);
	}
	
	
	
	

}
