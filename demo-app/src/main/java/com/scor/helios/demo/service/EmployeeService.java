package com.scor.helios.demo.service;

import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.google.gson.JsonObject;
import com.scor.helios.demo.controller.EmployeeController;
import com.scor.helios.demo.customException.DataNotFoundException;
import com.scor.helios.demo.customException.EmptyResultDataAccessException;
import com.scor.helios.demo.util.ResponseHandler;
import com.scor.helios.demo.util.ResponseModel;

@Service

public class EmployeeService {
	private static final Logger logger =  LoggerFactory.getLogger(EmployeeService.class);
	
	public String getHello() {
		
		return "Welcome to the Application";
	}
	
	public ResponseEntity<ResponseModel> getEmployeeById(String employeeId) {
		
		JSONObject response = new JSONObject();
		
				
		if(employeeId.equals("1")) {
			logger.info("in if block");
			response.put("id", "1");
			response.put("name", "mayur");
			response.put("last name", "pawar");
			return ResponseHandler.getResponseEntity(response, HttpStatus.OK, true, null, null);
			
			//response.put("employeeExist", true);
		}else {
			throw new DataNotFoundException();
		}
		
	}
}
