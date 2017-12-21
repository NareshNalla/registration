package com.journaldev.spring.service;

import com.journaldev.spring.model.Address;
import com.journaldev.spring.model.College;
import com.journaldev.spring.model.Student;

public interface PersonService {

	
	boolean register(Student student);

	boolean addCollege(College college);

	boolean addAddress(Address address);
	
}
