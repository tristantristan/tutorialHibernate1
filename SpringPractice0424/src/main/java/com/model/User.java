package com.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "AAAUsersTable") // this will be the Database Table Name
public class User{
	
	@Id // this will be the primary key
	@Column(name = "UserId") // set an explicit columnName
	int userId;

	@Column(name = "Username") // set an explicit columnName
	String userName;
	@Column(name = "JoinedDate") // set an explicit columnName
	
	Date joinedDate;
	@Column(name = "Address") // set an explicit columnName
	String address;
	
	@Column(name = "Description") // set an explicit columnName
	@Lob
	String description;
	
	@Transient // not declared as a column in a database table
	String notAColumn;

	public User() {
		
	}
	
	public User(int userId, String userName, Date joinedDate, String address, String description) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.joinedDate = joinedDate;
		this.address = address;
		this.description = description;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public Date getJoinedDate() {
		return joinedDate;
	}

	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
