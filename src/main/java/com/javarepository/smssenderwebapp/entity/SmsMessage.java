package com.javarepository.smssenderwebapp.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "SmsMessage")
public class SmsMessage {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@NotNull
	private Date createdOn;

	private Date sentOn;

	private String senderAlias;

	@NotNull
	private String mobileFrom;

	@NotNull
	private String mobileTo;

	@NotNull
	private String text;

	public SmsMessage(String senderAlias, String mobileFrom, String mobileTo, String text) {
		super();
		this.createdOn = new Date();
		this.senderAlias = senderAlias;
		this.mobileFrom = mobileFrom;
		this.mobileTo = mobileTo;
		this.text = text;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Date getSentOn() {
		return sentOn;
	}

	public void setSentOn(Date sentOn) {
		this.sentOn = sentOn;
	}

	public String getSenderAlias() {
		return senderAlias;
	}

	public void setSenderAlias(String senderAlias) {
		this.senderAlias = senderAlias;
	}

	public String getMobileFrom() {
		return mobileFrom;
	}

	public void setMobileFrom(String mobileFrom) {
		this.mobileFrom = mobileFrom;
	}

	public String getMobileTo() {
		return mobileTo;
	}

	public void setMobileTo(String mobileTo) {
		this.mobileTo = mobileTo;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
