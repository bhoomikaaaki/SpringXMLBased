package com.bhoomi.spring.SpringXML;

public class User {
	
	String userName;
	int userId;
	int age;
	public User()
	{
		
	}
	public User(String userName,int userId,int age)
	{
		this.userName=userName;
		this.userId=userId;
		this.age=age;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", userId=" + userId + ", age=" + age + "]";
	}
	
	

}
