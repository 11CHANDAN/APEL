package com.example.demo.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.module.User_Registration;
import com.example.demo.repo.UserRegistration_Repo;

//controller annotation is used to expose the class to server or browser side.
@Controller
public class UserController {
	//autowired annotation is used to inject the dependency automaticaly by spring container.
	@Autowired
	UserRegistration_Repo repo;
	
	//RequestMapping annotaion is used allow request from the web
	//saveuser() is will accepts user data. 
	@RequestMapping("/saveUser")
	String saveUser() {
		return "userdata.jsp";
	}
	@RequestMapping("/success")
	String success(User_Registration u1) {
		String email=u1.getEmail();
		long phone=u1.getMobileNumber();
		//find by email is used to check email and phone no are already present in java or not.
		User_Registration u2=repo.findByEmailAndPhone(email,phone);
		String dob=""+u1.getDOB();
		UserController user=new UserController();
		//date() is used to check age is greater than 21 or not
		int age=user.date(dob);
		if(age<=21) {
			return "underage.jsp";
		}
		else if(u2==null) {
			repo.save(u1);
			return "successful.jsp";
		}
		else {
			return "email.jsp";
		}
	}
	int date(String dob) {
		//extract the current date
		LocalDate currentDate=LocalDate.now();
		//this gives us current date
		String date1=currentDate+"";
		//this gives us user Date Of Birth
		String date2=dob+"";
		//date3 contains only the year of current date
		String date3=date1.substring(0,4);
		//date4 contains only the year of date of birth
		String date4=date2.substring(0,4);
		//converting current date and date of birth from string to integer to find their age.
		int a=0;
		int b=0;
		for(int i=0;i<date3.length();i++) {
			a=a*10+date3.charAt(i)-48;
			b=b*10+date4.charAt(i)-48;
		}
		return a-b;
	}
}
