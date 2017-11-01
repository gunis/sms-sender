package com.javarepository.smssenderwebapp.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.javarepository.smssenderwebapp.entity.SmsMessage;

public interface SmsMessageRepository extends CrudRepository<SmsMessage, Long> {

	@Query("FROM SmsMessage AS sms WHERE sms.id = ?1")
	public SmsMessage findById(long id);
}
