package com.example.UserInfo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.UserInfo.model.User;

public interface UserRepository extends CrudRepository<User,Long>{

	public User findByUserName(String userName);

}
