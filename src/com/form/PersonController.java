package com.form;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class PersonController {

	 @Autowired
	    private PersonDao personDao;
	 
	 @Transactional
   @RequestMapping(value = "/add/person", method = RequestMethod.POST)
   public String addStudent(@ModelAttribute("persondto")PersonDataDTO personDataDTO, 
   ModelMap model) {
	   DataSourceTransactionManager transactionManager=null;
	   TransactionStatus status=null;
	   personDao.persist(new Person(personDataDTO.getFirstName(),personDataDTO.getLastName()
			   					,new Date(),new Address(personDataDTO.getCity(),personDataDTO.getState())));
      
      model.addAttribute("personDataDTO", personDataDTO);
      
      return "result";
   }
}