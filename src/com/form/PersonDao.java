package com.form;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
 
@Component(value="personDao")
public class PersonDao {
    // Injected database connection:
	
    @PersistenceContext 
    private EntityManager em;
 
    // Stores a new guest:
    //Container start the transaction and commit or rollback as per method execution
    //So you should not commit or rollback the transaction 
    //@Transactional you should apply to business service methods and not to DAO methods
    //If it at class level it is applicable for all methods
    //@Transactional
    @Transactional(readOnly = false, propagation = Propagation.MANDATORY)
    public void persist(Person person) {
    	try{
    		System.out.println("From persist1");
        em.persist(person);
        
    	}catch(Exception e)
    			{
    		System.out.println("From persist2");
    			}
    }
 
}
