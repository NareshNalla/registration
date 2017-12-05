package com.journaldev.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.journaldev.spring.model.Person;
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
	
	@RequestMapping(value = "/persons", method = RequestMethod.GET)
	public String listPersons(Model model) {
		model.addAttribute("person", new Person());
		model.addAttribute("listPersons", this.personService.listPersons());
		return "person";
	}
	
	//For add and update person both
	@RequestMapping(value= "/person/add", method = RequestMethod.POST)
	public String addPerson(@ModelAttribute("person") Person p){
		
		if(p.getId() == 0){
			//new person, add it
			this.personService.addPerson(p);
		}else{
			//existing person, call update
			this.personService.updatePerson(p);
		}
		
		return "redirect:/persons";
		
	}
	
	@RequestMapping("/remove/{id}")
    public String removePerson(@PathVariable("id") int id){
		
        this.personService.removePerson(id);
        return "redirect:/persons";
    }
 
    @RequestMapping("/edit/{id}")
    public String editPerson(@PathVariable("id") int id, Model model){
        model.addAttribute("person", this.personService.getPersonById(id));
        model.addAttribute("listPersons", this.personService.listPersons());
        return "person";
    }
    
    @RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView register(@ModelAttribute("student") Student student) throws Exception {
    	
    	System.out.println("In PersonController.register :: Values to insert in to DB.."+student.toString());
		/*log.debug("In StudentController.register");
*/
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.addObject("student", student);
		/*log.debug("In StudentController.register before if");*/
		if (true) {
			try {
				/*log.debug("In StudentController.register in try");*/
				boolean flag = this.personService.register(student);
				boolean flag1 = this.personService.addCollege(student);
				boolean flag2 = this.personService.addAddress(student);
				System.out.println("In PersonController.register :: Values to insert in to DB.."+flag);

			/*	log.debug("In ImageController.uploadImage After Database hit flag=" + flag + flag1 + flag2);*/
			} catch (Exception e) {
				modelAndView.addObject("failMessage" + e.getMessage());
			}
			modelAndView.setViewName("upload");
		} else {
			modelAndView.addObject("emptyFile", "No file is been uploaded");
		}

		return new ModelAndView("index");
	}
    
	
}
