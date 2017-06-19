package com.katie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.katie.dao.NameDao;
import com.katie.model.Name;

@Service
public class NameService {

	private String word = "test";
	
	@Autowired
	private NameDao nameDao;
	
	public String getWord(){
		return word;
	}
	
	public void postName(Name myName){
		nameDao.saveName(myName);
	}
	
	
}
