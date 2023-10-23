package me.dio.webapi.handler;

import lombok.Data;

import java.util.Date;

@Data
public class ResponseError {

	private Date timestamp = new Date();
	private String status = "error";
	private int statusCode = 400;
	private String error;

	public Date getTimestamp() {
		return timestamp;
	}

}
