package net.app.pack.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Message {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int msgId;
	private int senderId;
	private int receiverId;
	private String messageContent;

    public Message() {}


	public Message(int senderId, int receiverId, String messageContent) {
		this.senderId = senderId;
		this.receiverId = receiverId;
		this.messageContent = messageContent;
	}

	public int getMsgId() {
		return msgId;
	}

	public void setMsgId(int msgId) {
		this.msgId = msgId;
	}

	public int getSenderId() {
		return senderId;
	}

	public void setSenderId(int senderId) {
		this.senderId = senderId;
	}

	public int getReceiverId() {
		return receiverId;
	}

	public void setReceiverId(int receiverId) {
		this.receiverId = receiverId;
	}

	public String getMessageContent() {
		return messageContent;
	}

	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}
	
	

}
