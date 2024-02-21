package com.scor.helios.demo.customException;

public class MandatoryFieldException extends RuntimeException {

	public MandatoryFieldException(String message) {super(message);}
}
