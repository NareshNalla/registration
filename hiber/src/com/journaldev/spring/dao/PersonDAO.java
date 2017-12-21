package com.journaldev.spring.dao;

import com.journaldev.spring.model.Address;
import com.journaldev.spring.model.College;
import com.journaldev.spring.model.Student;

public interface PersonDAO {

	
	public boolean register(Student student);
	public boolean addCollege(College student);
	public boolean addAddress(Address address);
	}
