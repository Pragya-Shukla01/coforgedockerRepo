package com.coforge.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.coforge.entities.User;
import com.coforge.repositories.UserRepo;

@Service
@Repository
public class UserService {
	@Autowired
	UserRepo Repo;

	public List<User> getAllUser(){
		return Repo.findAll();
	}
	public User addUser(User user) {
		return Repo.save(user);
	}
	public User getByUserId(long userId) {
		return Repo.findById(userId).orElseThrow(()->new RuntimeException());
	}
}
