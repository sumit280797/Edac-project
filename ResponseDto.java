package com.app.dto;

public class ResponseDto<T> {

	private T result;

	public ResponseDto() {
		// TODO Auto-generated constructor stub
	}

	public ResponseDto(T result) {
		super();
		this.result = result;
	}

	public T getResult() {
		return result;
	}

	public void setResult(T result) {
		this.result = result;
	}

}
