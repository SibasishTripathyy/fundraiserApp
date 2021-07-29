package com.ngo.fundraiser.repository;


import com.ngo.fundraiser.entity.User;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	List<User> findByNameAndPassword(String name,String password);
}
