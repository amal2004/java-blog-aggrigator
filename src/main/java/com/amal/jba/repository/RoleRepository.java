package com.amal.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amal.jba.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{

	Role findByName(String name);

}
