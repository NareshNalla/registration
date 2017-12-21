package com.journaldev.spring.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.journaldev.spring.model.Address;
import com.journaldev.spring.model.College;
import com.journaldev.spring.model.Student;

@Repository
public class PersonDAOImpl implements PersonDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(PersonDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}


	
	@Override
	public boolean register(Student student) {
		System.out.println("In PersonDAOImpl.register :: Values to insert in to DB.."+student.toString());
		
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(student);
		System.out.println("PersonDAOImpl after persist");
		/*log.info("Person saved successfully, Person Details="+student);*/
		return true;
	}

	



	@Override
	public boolean addCollege(College college) {
        System.out.println("In PersonDAOImpl.addCollege :: Values to insert in to DB.."+college.toString());
		
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(college);
		System.out.println("PersonDAOImpl.addCollege after persist");
		/*log.info("Person saved successfully, Person Details="+student);*/
		return true;
	}

	@Override
	public boolean addAddress(Address address) {
        System.out.println("In PersonDAOImpl.register :: Values to insert in to DB.."+address.toString());
		
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(address);
		System.out.println("PersonDAOImpl after persist");
		/*log.info("Person saved successfully, Person Details="+student);*/
		return true;
	}

}
