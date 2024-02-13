package com.ty.hospital_app.Dao;

import com.ty.hospital_app.entity.Address;
import com.ty.hospital_app.entityFactoryHelper.EntityFactoryHelp;

public class AddressDao {

	// save the address from the address database
	public Address saveAddress(Address address) {
		if (address != null) {
			EntityFactoryHelp.entityTransaction.begin();
			EntityFactoryHelp.entityManager.persist(address);
			EntityFactoryHelp.entityTransaction.commit();
		}
		return address;

	}

	// search Item into Item from Database
	public Address searchItem(String address_Id) {
		return EntityFactoryHelp.entityManager.find(Address.class, address_Id);
	}

	// update Item into Item from database
	public Address updateItem(String address_Id, Address address) {
		if (address_Id.equalsIgnoreCase(address.getAddress_Id()) && address != null) {
			EntityFactoryHelp.entityTransaction.begin();
			EntityFactoryHelp.entityManager.merge(address);
			EntityFactoryHelp.entityTransaction.commit();
		}
		return address;
	}

	// remove the item from the database
	public boolean removeAddress(String address_Id) {
		if (address_Id != null) {
			Address address = searchItem(address_Id);
			EntityFactoryHelp.entityTransaction.begin();
			EntityFactoryHelp.entityManager.remove(address);
			EntityFactoryHelp.entityTransaction.commit();
			return true;
		}
		return false;

	}
}
