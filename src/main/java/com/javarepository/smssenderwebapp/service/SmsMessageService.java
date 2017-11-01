package com.javarepository.smssenderwebapp.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.javarepository.smssenderwebapp.entity.SmsMessage;
import com.javarepository.smssenderwebapp.repository.SmsMessageRepository;

@Service
public class SmsMessageService {

	@Autowired
	SmsMessageRepository smsMessageRepository;

	SmsMessage createSmsMessage(String senderAlias, String mobileFrom, String mobileTo,
			String text) {
		SmsMessage smsMessage = new SmsMessage(senderAlias, mobileFrom, mobileTo, text);

		smsMessageRepository.save(smsMessage);

		return smsMessage;
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	SmsMessage send(long messageId) {
		SmsMessage smsMessage = smsMessageRepository.findById(messageId);

		smsMessage.setSentOn(new Date());
		smsMessageRepository.save(smsMessage);

		return smsMessage;
	}
}
