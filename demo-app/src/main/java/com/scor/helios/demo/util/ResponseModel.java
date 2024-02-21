package com.scor.helios.demo.util;

public class ResponseModel {
	
	private boolean success;
	private String errorCode;
	private String errorMessage;
	private Object data;
	
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "ResponseModel [success=" + success + ", errorCode=" + errorCode + ", errorMessage=" + errorMessage
				+ ", data=" + data + ", isSuccess()=" + isSuccess() + ", getErrorCode()=" + getErrorCode()
				+ ", getErrorMessage()=" + getErrorMessage() + ", getData()=" + getData() + "]";
	}
	
	

}
