package net.app.pack.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import net.app.pack.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	Optional<User> findByUserName(String userName);

}
