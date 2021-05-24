package net.javaguides.springboot.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends Exception {
	public static final long serialVersionID = 1L;
	
	public ResourceNotFoundException(String message)
	{
		super(message);
	}
	
	

}
