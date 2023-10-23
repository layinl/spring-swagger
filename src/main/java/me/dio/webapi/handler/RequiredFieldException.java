package me.dio.webapi.handler;

public class RequiredFieldException extends BusinessException {

	public RequiredFieldException(String field) {
		super(String.format("Field %s is required", field));
	}

	public RequiredFieldException(String message, Object... params) {
		super(message, params);
	}

}
