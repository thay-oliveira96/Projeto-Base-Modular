package br.com.trosoftware.resources.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.trosoftware.domain.idm.IDMStatus;
import br.com.trosoftware.services.exceptions.ObjectnotFoundExcption;
import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {
	
	@ExceptionHandler(ObjectnotFoundExcption.class)
	public ResponseEntity<StandardError> bjectnotFoundExcption(ObjectnotFoundExcption ex, HttpServletRequest request) {
		
		StandardError error = new StandardError(System.currentTimeMillis(), 
					HttpStatus.NOT_FOUND.value(), IDMStatus.STATUS_NOT_FOUND, ex.getMessage(), request.getRequestURI());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
		
	}
}
