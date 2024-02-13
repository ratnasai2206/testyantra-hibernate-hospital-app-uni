package com.ty.hospital_app.Dao;

import java.util.List;


import com.ty.hospital_app.entity.Branch;
import com.ty.hospital_app.entity.Encounter;
import com.ty.hospital_app.entity.Hospital;
import com.ty.hospital_app.entity.Item;
import com.ty.hospital_app.entity.MedOrders;
import com.ty.hospital_app.entity.Person;
import com.ty.hospital_app.entityFactoryHelper.EntityFactoryHelp;

public class HospitalDao {

	// save hospital in the database
	public Hospital saveHospital(Hospital hospital) {
		if (hospital != null) {
			EntityFactoryHelp.entityTransaction.begin();
			EntityFactoryHelp.entityManager.persist(hospital);
			EntityFactoryHelp.entityTransaction.commit();
		}
		return hospital;
	}

	// search Hospital in the database
	public Hospital searchHospital(String hospital_Id) {

		return EntityFactoryHelp.entityManager.find(Hospital.class, hospital_Id);

	}

	// update hospital from the database
	public Hospital updateHospital(String hospital_Id, Hospital hospital, Branch branch) {
		if (hospital_Id.equalsIgnoreCase(hospital.getHospital_Id()) && hospital != null) {
			EntityFactoryHelp.entityTransaction.begin();
			EntityFactoryHelp.entityManager.remove(branch);
			EntityFactoryHelp.entityManager.merge(hospital);
			EntityFactoryHelp.entityTransaction.begin();
		}
		return hospital;
	}

	public Hospital updateHospital(String hospital_Id, Hospital hospital) {
		if (hospital_Id.equalsIgnoreCase(hospital.getHospital_Id()) && hospital != null) {
			EntityFactoryHelp.entityTransaction.begin();
			EntityFactoryHelp.entityManager.merge(hospital);
			EntityFactoryHelp.entityTransaction.commit();
		}
		return hospital;
	}

	// remove hospital from the database
	public boolean removeHospital(String hospital_id) {
		Hospital hospital = EntityFactoryHelp.entityManager().find(Hospital.class, hospital_id);
		List<Branch> branches = hospital.getBranch();
		if (branches != null) {
			for (Branch branch : branches) {
				List<Encounter> encounters = branch.getEncounters();
				if (encounters != null) {
					for (Encounter encounter : encounters) {
						Person person = encounter.getPerson();
						if (person != null) {
							EntityFactoryHelp.entityTransaction().begin();
							EntityFactoryHelp.entityManager().remove(person);
							EntityFactoryHelp.entityTransaction().commit();
						}
						List<MedOrders> medOrders = encounter.getMedOrders();
						if (medOrders != null) {
							for (MedOrders medOrder : medOrders) {
								List<Item> items = medOrder.getItems();
								for (Item item : items) {
									if (item != null) {
										EntityFactoryHelp.entityTransaction().begin();
										EntityFactoryHelp.entityManager().remove(item);
										EntityFactoryHelp.entityTransaction().commit();
									}
								}
								medOrder.setItems(null);
								EntityFactoryHelp.entityTransaction().begin();
								EntityFactoryHelp.entityManager().merge(medOrder);
								EntityFactoryHelp.entityTransaction().commit();
								EntityFactoryHelp.entityTransaction().begin();
								EntityFactoryHelp.entityManager().remove(medOrder);
								EntityFactoryHelp.entityTransaction().commit();
							}
						}
						encounter.setMedOrders(null);
						EntityFactoryHelp.entityTransaction().begin();
						EntityFactoryHelp.entityManager().merge(encounter);

						EntityFactoryHelp.entityTransaction().commit();
						EntityFactoryHelp.entityTransaction().begin();
						EntityFactoryHelp.entityManager().remove(encounter);
						EntityFactoryHelp.entityTransaction().commit();
					}
				}
				EntityFactoryHelp.entityTransaction().begin();
				EntityFactoryHelp.entityManager().remove(branch);
				EntityFactoryHelp.entityTransaction().commit();
			}
		}
		if (hospital_id.equalsIgnoreCase(hospital.getHospital_Id())) {
			EntityFactoryHelp.entityTransaction().begin();
			EntityFactoryHelp.entityManager().remove(hospital);
			EntityFactoryHelp.entityTransaction().commit();
			return true;
		}
		return false;

	}
}
