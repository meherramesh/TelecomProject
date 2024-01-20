package com.ibm.cna.telecom.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)  //id is incorrect
public class ConnectionTypeException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public ConnectionTypeException(String message){
		super(message); //calling
	}

}
