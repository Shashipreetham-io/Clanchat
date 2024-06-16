package net.app.pack.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import net.app.pack.entity.LoginUser;
import net.app.pack.entity.User;


public interface UserService {
	public User registerUser(User user);
	public ResponseEntity<User> loginUser(LoginUser loginUser);
	List<User> getAllUsers();
	public Optional<User> getUserById(Integer id);
}
