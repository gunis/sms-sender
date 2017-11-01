package com.javarepository.smssenderwebapp.controller;

public final class ControllerMappings {

	public static String getTemplateForPageMapping(String pageMapping) {
		return pageMapping.substring(1);
	}

	public static final String CONTEXT_ROOT = "/";

	public static final class Public {
		public static final String INDEX = "";
		public static final String SEND_SMS_MESSAGE = CONTEXT_ROOT + "send-sms-message";
	}

	static final class Error {
		public static final String ERROR_ROOT = "/error";
		public static final String ERROR_404 = "/error/404";
		public static final String ERROR_500 = "/error/500";
	}
}
