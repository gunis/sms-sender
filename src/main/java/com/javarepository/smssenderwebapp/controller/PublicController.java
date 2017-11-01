package com.javarepository.smssenderwebapp.controller;

import static com.javarepository.smssenderwebapp.controller.ControllerMappings.CONTEXT_ROOT;
import static com.javarepository.smssenderwebapp.controller.ControllerMappings.Public.INDEX;
import static com.javarepository.smssenderwebapp.controller.ControllerMappings.Public.SEND_SMS_MESSAGE;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javarepository.smssenderwebapp.bean.SmsSendForm;

@Controller
@RequestMapping(CONTEXT_ROOT)
public class PublicController {

	protected static Logger logger = LoggerFactory.getLogger(PublicController.class);

	@GetMapping(INDEX)
	public String login() {

		return "redirect:" + SEND_SMS_MESSAGE;
	}

	@GetMapping(SEND_SMS_MESSAGE)
	public String sendSmsMessage(SmsSendForm smsSendForm, Model model) {
		logger.info(String.format("Loading page: %s", SEND_SMS_MESSAGE));

		return "public" + SEND_SMS_MESSAGE;
	}

	@PostMapping(SEND_SMS_MESSAGE)
	public String processContactForm(HttpServletRequest request, @Valid SmsSendForm smsSendForm,
			BindingResult bindingResult, Model model) {

		if (bindingResult.hasErrors()) {
			return "public" + SEND_SMS_MESSAGE;
		}

		// TODO: process form..

		return null;
	}
}
