package com.journaldev.spring.service;

import java.util.List;

import com.journaldev.spring.model.Person;
import com.journaldev.spring.model.Student;

public interface PersonService {

	public void addPerson(Person p);
	public void updatePerson(Person p);
	public List<Person> listPersons();
	public Person getPersonById(int id);
	public void removePerson(int id);
	boolean register(Student student);

	boolean addCollege(Student student);

	boolean addAddress(Student student);
	
}
