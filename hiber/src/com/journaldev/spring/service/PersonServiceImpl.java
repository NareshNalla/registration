package com.journaldev.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.journaldev.spring.dao.PersonDAO;
import com.journaldev.spring.model.Person;
import com.journaldev.spring.model.Student;


@Service
public class PersonServiceImpl implements PersonService {
	
	private PersonDAO personDAO;

	public void setPersonDAO(PersonDAO personDAO) {
		this.personDAO = personDAO;
	}

	@Override
	@Transactional
	public void addPerson(Person p) {
		this.personDAO.addPerson(p);
	}

	@Override
	@Transactional
	public void updatePerson(Person p) {
		this.personDAO.updatePerson(p);
	}

	@Override
	@Transactional
	public List<Person> listPersons() {
		return this.personDAO.listPersons();
	}

	@Override
	@Transactional
	public Person getPersonById(int id) {
		return this.personDAO.getPersonById(id);
	}

	@Override
	@Transactional
	public void removePerson(int id) {
		this.personDAO.removePerson(id);
	}
	@Override
	@Transactional
	public boolean register(Student student) {
		// TODO Auto-generated method stub
		/*log.debug("ImageService.register");*/
		boolean flag=this.personDAO.register(student);
		System.out.println("PersonServiceImpl"+flag);
		/*log.debug("ImageService.saveImage return from DAO :"+flag);*/
		return flag;
	}

	@Override
	@Transactional
	public boolean addCollege(Student student) {
		// TODO Auto-generated method stub
		/*log.debug("ImageService.addCollege");*/
		boolean flag=this.personDAO.addCollege(student);
		return flag;
	}

	@Override
	@Transactional
	public boolean addAddress(Student student) {
		// TODO Auto-generated method stub
		/*log.debug("ImageService.addAddress");*/
		boolean flag=this.personDAO.addAddress(student);
		return flag;
	}

}
