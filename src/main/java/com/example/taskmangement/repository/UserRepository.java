package com.example.taskmangement.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.taskmangement.dto.Role;
import com.example.taskmangement.dto.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	Optional<User> findByEmail(String email);

	User findByRole(Role admin);
}
