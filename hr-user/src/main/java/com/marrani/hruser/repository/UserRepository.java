package com.marrani.hruser.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.marrani.hruser.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);

}
