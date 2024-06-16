package net.app.pack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import net.app.pack.entity.Message;
import net.app.pack.service.MessageService;

@RestController
public class MessageController {

	@Autowired
	private MessageService messageService;
	
	@PostMapping("/sendMessage")
	public ResponseEntity<String> sendMessage(@RequestBody Message message) {
        messageService.sendMessage(message);
        return new ResponseEntity<>("Message sent successfully", HttpStatus.OK);
	}
	
	@GetMapping("/GetMessageBetweenUsers/{senderId}/{receiverId}")
	public List<Message> getAllMessages(@PathVariable Integer senderId,@PathVariable Integer receiverId){
		return messageService.getAllMessages(senderId, receiverId);
	}
	
	@DeleteMapping("/deleteMessage/{id}")
	public void deleteMessage(@PathVariable Integer id){
		messageService.deleteMessage(id);
	}
	
	
	
	
	
	
	
}
