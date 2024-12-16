package com.bhoomi.spring.SpringXML;

public class Message {
	
	String msg;
	
	public void sayMessage()
	{
		System.out.println("Hi,How are you?");
	}
	
	public void setMessage(String msg)
	{
		this.msg=msg;
	}
	
	public String getMessage()
	{
		return msg;
	}
	
}
