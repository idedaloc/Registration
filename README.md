# Registration

Simple create web project excercise for test

## ToReview

```java
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
```

