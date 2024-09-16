package com.raghavendera.project.SpringBootProject.error;

public class EntityNotFoundException extends Exception{

	public EntityNotFoundException() {
		super();
	}
	
	public EntityNotFoundException(String message)
	{
		super(message);
	}
	
	public EntityNotFoundException(String message, Throwable cause)
	{
		super(message,cause);
	}
	
	public EntityNotFoundException(Throwable cause) {
		super(cause);
	}
	
	public EntityNotFoundException(String message, Throwable cause,boolean enableSuppression,
            boolean writableStackTrace ) {
		super(message,cause,enableSuppression,writableStackTrace);
	}
}
