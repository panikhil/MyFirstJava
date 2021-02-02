package com.rakuten.basics;

public class StackFullException extends RuntimeException {

	public StackFullException(String message, Throwable cause) {
		//it will show the cause at the last and thus mentions the abstraction
		super(message, cause);
		
	}

}
