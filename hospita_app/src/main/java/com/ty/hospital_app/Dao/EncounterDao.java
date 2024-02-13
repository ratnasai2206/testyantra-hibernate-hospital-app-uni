package com.ty.hospital_app.Dao;

import java.util.List;

import com.ty.hospital_app.entity.Branch;
import com.ty.hospital_app.entity.Encounter;
import com.ty.hospital_app.entity.Person;
import com.ty.hospital_app.entityFactoryHelper.EntityFactoryHelp;

public class EncounterDao {

	// save Encounter in the Encounter database
	public Encounter saveEncounter(Encounter encounter, String branch_id, String person_id) {
		if (encounter != null && branch_id != null && person_id != null) {
			Person person=EntityFactoryHelp.entityManager.find(Person.class, person_id);
			Branch branch=EntityFactoryHelp.entityManager.find(Branch.class, branch_id);
			if(person!=null && branch!=null) {
				List<Encounter> encounters=branch.getEncounters();
				encounters.add(encounter);
				branch.setEncounters(encounters);
				EntityFactoryHelp.entityTransaction.begin();
				EntityFactoryHelp.entityManager.merge(branch);
				EntityFactoryHelp.entityManager.persist(encounter);
				EntityFactoryHelp.entityTransaction.commit();
			}
		}
		return encounter;
	}
	
	
	// update encounter data
	public Encounter updateEncounter(String encounter_Id,Encounter encounter) {
		if (encounter_Id.equalsIgnoreCase(encounter.getEncounter_Id()) && encounter!= null) {
			EntityFactoryHelp.entityTransaction.begin();
			EntityFactoryHelp.entityManager.merge(encounter);
			EntityFactoryHelp.entityTransaction.commit();
		}
		return encounter;
		
	}
	// find encounter from database
	public Encounter findEncounter(String encounter_Id) {
		return EntityFactoryHelp.entityManager.find(Encounter.class, encounter_Id);
	}

	// remove encounter from the database
	public boolean removeEncounter(String encounter_id) {

		if (encounter_id != null) {
			Encounter encounter = findEncounter(encounter_id);
			EntityFactoryHelp.entityTransaction.begin();
			EntityFactoryHelp.entityManager.remove(encounter);
			EntityFactoryHelp.entityTransaction.commit();
			return true;
		}
		return false;
	}

}
