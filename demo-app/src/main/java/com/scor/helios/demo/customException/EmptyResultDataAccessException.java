package com.scor.helios.demo.customException;

public class EmptyResultDataAccessException extends RuntimeException{
	
	public EmptyResultDataAccessException() {super();}
	public EmptyResultDataAccessException(String message) {super(message);}
	public EmptyResultDataAccessException(String message, Throwable cause) {super(message,cause);}
	public EmptyResultDataAccessException(Throwable cause) {super(cause);}

}
