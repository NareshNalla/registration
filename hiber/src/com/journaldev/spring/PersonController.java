package com.journaldev.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.journaldev.spring.model.Address;
import com.journaldev.spring.model.College;
import com.journaldev.spring.model.Student;
import com.journaldev.spring.service.PersonService;


@Controller
public class PersonController {
	
	private PersonService personService;
	
	@Autowired(required=true)
	@Qualifier(value="personService")
	public void setPersonService(PersonService ps){
		this.personService = ps;
	}
	
/*	private Logger log = PersonController.getLogger();

	// log4j configurations
	public static Logger getLogger() {

		Logger log = Logger.getLogger("LOGGER");

		return log;
	}*/

	
	
    @RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView register(@ModelAttribute("student") Student student, @ModelAttribute("col") College col, @ModelAttribute("adr") Address adr) throws Exception {
    	
    	System.out.println("In PersonController.register :: Values to insert in to DB.."+student.toString());
		/*log.debug("In StudentController.register");*/

		ModelAndView modelAndView = new ModelAndView();

		modelAndView.addObject("student", student);
		
		modelAndView.addObject("col", col);
		
		modelAndView.addObject("adr", adr);
		
		
		
		/*log.debug("In StudentController.register before if");*/
		
			try {
				boolean flag = this.personService.register(student);
				col.setSid(student.getSid());
				adr.setSid(student.getSid());
				boolean flag1 = this.personService.addCollege(col);
				boolean flag2 = this.personService.addAddress(adr);
				System.out.println("In PersonController.register :: Values to insert in to DB.."+flag);

				/*log.debug("In ImageController.uploadImage After Database hit flag=" + flag + flag1 + flag2);*/
			} catch (Exception e) {
				modelAndView.addObject("failMessage" + e.getMessage());
				return new ModelAndView("regiFail");
			}
		return new ModelAndView("regiSuccess");
}
}
