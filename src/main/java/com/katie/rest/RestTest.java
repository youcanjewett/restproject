package com.katie.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.katie.service.GreetingTest;
import com.katie.service.MyService;

@Component
@Path("/rest")
public class RestTest {

	
	public static String line = "empty";
	public static GreetingTest gtest = new GreetingTest(3, "cat"); 
	
	@Autowired
	public MyService myservice;
	
	@GET
	@Path("/hello")
	@Produces("text/html")
	public String hello()
	{
		return "Hello World " + myservice.getWord() + 
				"<html><body><h2><img src = http://cdn1-www.dogtime.com/assets/uploads/gallery/siberian-husky-dog-breed-pictures/siberian-husky-dog-breed-pictures-3.jpg></h2></body></html>";
	}
	
	@GET
	@Path("/getSave")
	
	public String getSave()
	{
		return line;
	}
	
	
	@POST
	@Path("/save")
	@Consumes(MediaType.TEXT_HTML)
	public Response save(String saveThis)
	{
		line = saveThis;
		return Response.ok().build();
	}
	
	
	@POST
	@Path("/anotherSave")
	@Consumes(MediaType.TEXT_HTML)
	public Response anotherSave(String saveThisAlso) {
		line = saveThisAlso;
		return Response.ok().build();
	}

	@GET
	@Path("/greeting")
	@Produces(MediaType.APPLICATION_JSON)
	public GreetingTest greeting(){
		return gtest;
	}
	
	@POST
	@Path("/greeting")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response greeting(GreetingTest greeting){
		gtest = greeting;
		return Response.ok().build();
	}
	
}
