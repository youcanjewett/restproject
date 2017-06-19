package com.katie.dao;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.katie.model.Name;

@Repository("nameDao")
public class NameDao extends AbstractDAO<Integer,Name>{

	public NameDao(){
		
	}
	
	@Transactional
	public void saveName(Name saveName){
		persist(saveName);
	}
	
	
}
