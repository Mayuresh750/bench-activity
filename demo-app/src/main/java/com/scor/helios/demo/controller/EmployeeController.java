package com.scor.helios.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scor.helios.demo.service.EmployeeService;
import com.scor.helios.demo.util.ResponseHandler;
import com.scor.helios.demo.util.ResponseModel;

@RestController
public class EmployeeController {
	
	private static final Logger logger =  LoggerFactory.getLogger(EmployeeController.class);
	@Autowired
	EmployeeService employeeService;

	@RequestMapping("/hello")
	public String hello() {
		return employeeService.getHello();
	}
	
	@GetMapping("/getById/{employeeId}")
	public ResponseEntity<ResponseModel> getEmployeeById(@PathVariable(value= "employeeId")String employeeId){
		
		logger.info("-------------- Get Request By ID called --------------");
//		return ResponseHandler.getResponseEntity("Employee Exists", HttpStatus.OK, true, null, null);
		return employeeService.getEmployeeById(employeeId);
	}
	
	
}
