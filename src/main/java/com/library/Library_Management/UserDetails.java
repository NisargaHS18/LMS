package com.library.Library_Management;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "user_details")
public class UserDetails {
	@Id
	@GeneratedValue
	int User_ID;
	String User_name;
	String Adress;

	public int getUser_ID() {
		return User_ID;
	}

	public void setUser_ID(int user_ID) {
		User_ID = user_ID;
	}

	public String getUser_name() {
		return User_name;
	}

	public void setUser_name(String user_name) {
		User_name = user_name;
	}

	public String getAddress() {
		return Adress;
	}

	public void setAddress(String address) {
		Adress = address;
	}

}
