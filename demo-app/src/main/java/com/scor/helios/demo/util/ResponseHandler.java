package com.scor.helios.demo.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseHandler {

	public static <T> ResponseEntity <ResponseModel> getResponseEntity( T request, HttpStatus httpStatus, boolean isSuccess, String errorMessage, String errorCode){
		
		ResponseModel responseModel = new ResponseModel();
		responseModel.setSuccess(isSuccess);
		responseModel.setErrorCode(errorCode);
		responseModel.setErrorMessage(errorMessage);
		responseModel.setData(request);
		
		return new ResponseEntity<>(responseModel,httpStatus);
	}
}
