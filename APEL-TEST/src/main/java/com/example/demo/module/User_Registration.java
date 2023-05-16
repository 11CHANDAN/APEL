package com.example.demo.module;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

//Entity annotation is used to create table inside database 
@Entity
//data annotation is used to generate getters,setters,constructors and toString method automatically
@Data
public class User_Registration {
	//Id will create the primary key automatically and generated value is used to generate values automatically.
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private long mobileNumber;
	@Temporal(TemporalType.DATE)
	private String DOB;
	private String location;
	private String Identification_Document;
}
