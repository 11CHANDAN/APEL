package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.module.User_Registration;

public interface UserRegistration_Repo extends JpaRepository<User_Registration, Integer>{
	//the below query is used to check user email and phone number are already present in database or not
	@Query(value="select * from User_Registration where email=?1 or mobile_number=?2",nativeQuery=true)
	User_Registration findByEmailAndPhone(String email,long mobileNumber);
}