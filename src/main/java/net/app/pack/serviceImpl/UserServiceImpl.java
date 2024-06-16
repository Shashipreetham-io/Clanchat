package net.app.pack.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import net.app.pack.entity.LoginUser;
import net.app.pack.entity.User;
import net.app.pack.repository.UserRepository;
import net.app.pack.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User registerUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public ResponseEntity<User> loginUser(LoginUser loginUser) {

		Optional<User> loggingUser=userRepository.findByUserName(loginUser.getUserName());
		
		if(loggingUser.isPresent()) {
			String pwd=loggingUser.get().getPassword();
			if(pwd.equals(loginUser.getPassword())) {
				return new ResponseEntity<>(loggingUser.get(),HttpStatus.OK);
		
			}
			else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
			
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}	
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public Optional<User> getUserById(Integer id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id);
	}

	

}
