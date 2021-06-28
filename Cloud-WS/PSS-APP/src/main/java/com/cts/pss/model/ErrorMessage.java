package com.cts.pss.model;

public class ErrorMessage {

	private int httpStatusCode;
	private String message;

	public ErrorMessage() {
		// TODO Auto-generated constructor stub
	}

	public ErrorMessage(int httpStatusCode, String message) {
		super();
		this.httpStatusCode = httpStatusCode;
		this.message = message;
	}

	public int getHttpStatusCode() {
		return httpStatusCode;
	}

	public void setHttpStatusCode(int httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
