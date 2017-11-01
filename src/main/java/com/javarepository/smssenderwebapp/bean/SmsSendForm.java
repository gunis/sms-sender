package com.javarepository.smssenderwebapp.bean;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

public class SmsSendForm {

	@NotNull
	@NotEmpty
	private String fromMobile;

	@NotNull
	@NotEmpty
	private String toMobile;

	@NotNull
	@NotEmpty
	private String message;

	public String getFromMobile() {
		return fromMobile;
	}

	public void setFromMobile(String fromMobile) {
		this.fromMobile = fromMobile;
	}

	public String getToMobile() {
		return toMobile;
	}

	public void setToMobile(String toMobile) {
		this.toMobile = toMobile;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
