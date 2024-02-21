package com.scor.helios.demo.customException;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.scor.helios.demo.util.ResponseHandler;
import com.scor.helios.demo.util.ResponseModel;

@RestControllerAdvice
public class EmployeeExceptionController {
	
	public static final Logger logger = LoggerFactory.getLogger(EmployeeExceptionController.class); 

	@ExceptionHandler(DataNotFoundException.class)
	public ResponseEntity<ResponseModel> handleDataNotFoundException(Exception e) throws IOException {
		return ResponseHandler.getResponseEntity(null, HttpStatus.OK, false, "Data Not Found", String.valueOf(HttpStatus.NOT_FOUND.value()));
	}
	
	@ExceptionHandler(EmptyResultDataAccessException.class)
	public ResponseEntity<ResponseModel> handleEmptyResultDataAccessException(Exception e) throws IOException{
		return ResponseHandler.getResponseEntity(null, HttpStatus.NOT_FOUND, false, null, null);
	}
}
