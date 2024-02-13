package com.ty.hospital_app.Dao;

import com.ty.hospital_app.entity.Item;
import com.ty.hospital_app.entityFactoryHelper.EntityFactoryHelp;

public class ItemDao {

	
	//save the item from the item database
	public Item saveItem(Item item) {
		if(item!=null) {
			EntityFactoryHelp.entityTransaction.begin();
			EntityFactoryHelp.entityManager.persist(item);
			EntityFactoryHelp.entityTransaction.commit();
		}
		return item;
		
	}
	
	
	//search Item into Item from Database
	public Item searchItem(String item_Id) {
		return EntityFactoryHelp.entityManager.find(Item.class, item_Id) ;
	}
	
	//update Item into Item from database
	public Item updateItem(String item_Id,Item item) {
		if(item_Id.equalsIgnoreCase(item.getItem_Id())&& item!=null) {
			EntityFactoryHelp.entityTransaction.begin();
			EntityFactoryHelp.entityManager.merge(item);
			EntityFactoryHelp.entityTransaction.commit();
		}
		return item;
	}
	
	// remove the item from the database
		public boolean removeItem(String item_Id) {
			if(item_Id !=null) {
				Item item=searchItem(item_Id);
				EntityFactoryHelp.entityTransaction().begin();
				EntityFactoryHelp.entityManager().remove(item);
				EntityFactoryHelp.entityTransaction().commit();
				return true;
			}
			return false;
			
		}
	
}
