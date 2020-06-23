package com.springdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.springdata.model.Users;

@Component
public interface UserRepository extends JpaRepository<Users, Long>{

	public Users findByName(String name);

}
