package net.app.pack.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import net.app.pack.entity.Message;

public interface MessageRepository extends JpaRepository<Message, Integer> {

	List<Message> findBySenderIdAndReceiverId(Integer senderId, Integer receiverId);
}