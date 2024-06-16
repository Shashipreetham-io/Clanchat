package net.app.pack.service;

import java.util.List;
import java.util.Optional;

import net.app.pack.entity.Message;

public interface MessageService {
	void sendMessage(Message message);
	public List<Message> getAllMessages(Integer senderId,Integer receiverId);
	public void deleteMessage(Integer id);
}
