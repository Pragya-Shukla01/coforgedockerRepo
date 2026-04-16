package com.coforge.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coforge.entities.User;

public interface UserRepo extends JpaRepository<User, Long> {

}
