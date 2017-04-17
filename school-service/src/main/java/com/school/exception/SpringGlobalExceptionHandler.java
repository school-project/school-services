package com.school.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.UUID;

/**
 * Created by Ivan.Luo
 * Date: 4/13/2017 10:26 AM
 */
@ControllerAdvice
public class SpringGlobalExceptionHandler
{
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringGlobalExceptionHandler.class);

	private static final int HTTP_OK = 200;

	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<ResponseErrorMessage> restServiceErrorHandler(HttpServletRequest request, Exception ex)
			throws Exception
	{
		// If the exception is annotated with @ResponseStatus rethrow it and let the framework handle it
		if (AnnotationUtils.findAnnotation(ex.getClass(), ResponseStatus.class) != null)
		{
			LOGGER.error("Throw the annotated exception");
			throw ex;
		}

		ResponseErrorMessage responseErrorMessage = new ResponseErrorMessage();

		LOGGER.debug("Processing exception by global exception handler");
		String uuid = UUID.randomUUID().toString();
		responseErrorMessage.setMessageId(uuid);
		responseErrorMessage.setRequestURL(request.getRequestURL().toString());
		responseErrorMessage.setMessage(ex.getMessage());
		responseErrorMessage.setTimeStamp(new Date());
		responseErrorMessage.setStatusCode(HTTP_OK);

		return new ResponseEntity<ResponseErrorMessage>(responseErrorMessage,
				HttpStatus.valueOf(responseErrorMessage.getStatusCode()));
	}
}
