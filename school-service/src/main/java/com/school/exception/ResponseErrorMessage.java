package com.school.exception;

import org.codehaus.jackson.annotate.JsonIgnore;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Ivan.Luo
 * Date: 4/13/2017 10:23 AM
 */
public class ResponseErrorMessage implements Serializable
{
	private static final int SERVER_ERROR = 500;

	private String messageId;

	@JsonIgnore
	private int statusCode;

	private String message;

	@JsonIgnore
	private String requestURL;

	@JsonIgnore
	private Date timeStamp;

	public int getStatusCode()
	{
		return statusCode;
	}

	public void setStatusCode(int statusCode)
	{
		this.statusCode = statusCode;
	}

	public String getMessage()
	{
		if (SERVER_ERROR == statusCode)
		{
			message = "Internal Server Error, please contact admin with MessageId!";
		}
		return message;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}

	public String getMessageId()
	{
		return messageId;
	}

	public void setMessageId(String messageId)
	{
		this.messageId = messageId;
	}

	public String getRequestURL()
	{
		return requestURL;
	}

	public void setRequestURL(String requestURL)
	{
		this.requestURL = requestURL;
	}

	public Date getTimeStamp()
	{
		return timeStamp == null ? null : (Date) timeStamp.clone();
	}

	public void setTimeStamp(Date timeStamp)
	{
		this.timeStamp = timeStamp == null ? null : (Date) timeStamp.clone();
	}

}
