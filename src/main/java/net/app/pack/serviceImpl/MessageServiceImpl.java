package net.app.pack.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.app.pack.entity.Message;
import net.app.pack.repository.MessageRepository;
import net.app.pack.service.MessageService;

@Service
public class MessageServiceImpl implements MessageService {
	
	@Autowired
	private MessageRepository messageRepository;

	@Override
	public void sendMessage(Message message) {
		messageRepository.save(message);
	}

	@Override
	public List<Message> getAllMessages(Integer senderId, Integer receiverId) {
		return messageRepository.findBySenderIdAndReceiverId(senderId,receiverId);
	}

	@Override
	public void deleteMessage(Integer id) {
		messageRepository.deleteById(id);
	}
	

	
	
	
	
	
	

}
