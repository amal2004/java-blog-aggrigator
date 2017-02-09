package com.amal.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amal.jba.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByName(String name);


}
