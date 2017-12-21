package com.journaldev.spring.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.journaldev.spring.dao.PersonDAO;
import com.journaldev.spring.model.Address;
import com.journaldev.spring.model.College;
import com.journaldev.spring.model.Student;


@Service
public class PersonServiceImpl implements PersonService {
	
	private PersonDAO personDAO;

	public void setPersonDAO(PersonDAO personDAO) {
		this.personDAO = personDAO;
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
	public boolean addCollege(College col) {
		
		boolean flag=this.personDAO.addCollege(col);
		return flag;
	}

	@Override
	@Transactional
	public boolean addAddress(Address adr) {
		
		boolean flag=this.personDAO.addAddress(adr);
		return flag;
	}

}
