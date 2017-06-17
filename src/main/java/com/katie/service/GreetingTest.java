package com.katie.service;



public class GreetingTest {

	private int id;
	private String content;
	
	@SuppressWarnings("unused")
	private GreetingTest(){
		
	}
	
	public GreetingTest(int id, String content) {
		this.id = id;
		this.content = content;
	}
	
	public int getId(){
		return id;
	}
	
	public String getContent(){
		return content;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public void setContent(String content){
		this.content = content;
	}
	
}
