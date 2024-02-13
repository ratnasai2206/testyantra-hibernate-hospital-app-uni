package com.ty.hospital_app.Dao;

import com.ty.hospital_app.entity.Person;
import com.ty.hospital_app.entityFactoryHelper.EntityFactoryHelp;

public class PersonDao {

	
	//save person in the database
	public Person savePerson(Person person) {
		if(person!=null) {
			EntityFactoryHelp.entityTransaction.begin();
			EntityFactoryHelp.entityManager.persist(person);
			EntityFactoryHelp.entityTransaction.commit();
		}
		return person;
	}
	
	//search person in the database
	public Person searchPerson(String person_Id) {
	
		return EntityFactoryHelp.entityManager.find(Person.class, person_Id);
		
	}
	
	//update person from the database
	public Person updatePerson(String person_Id,Person person) {
		if(person_Id.equalsIgnoreCase(person.getPerson_Id())&& person!=null) {
			EntityFactoryHelp.entityTransaction.begin();
			EntityFactoryHelp.entityManager.merge(person);
			EntityFactoryHelp.entityTransaction.commit();
		}
		return person;
	}
	
	// remove the person from the database
	public boolean removePerson(String person_Id) {
		if(person_Id !=null) {
			Person person=searchPerson(person_Id);
			EntityFactoryHelp.entityTransaction().begin();
			EntityFactoryHelp.entityManager().remove(person);
			EntityFactoryHelp.entityTransaction().commit();
			return true;
		}
		return false;
		
	}
	
	
}
