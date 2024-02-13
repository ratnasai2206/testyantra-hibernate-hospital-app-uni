package com.ty.hospital_app.Dao;


import java.util.List;

import com.ty.hospital_app.entity.Encounter;
import com.ty.hospital_app.entity.Item;
import com.ty.hospital_app.entity.MedOrders;
import com.ty.hospital_app.entityFactoryHelper.EntityFactoryHelp;

public class MedOrderDao {

	// save MedOrder in the MedOrder database
	public MedOrders saveMedOrders(MedOrders medOrders, String encounter_id) {
		if(medOrders!=null&&encounter_id!=null) {
			Encounter encounter=EntityFactoryHelp.entityManager.find(Encounter.class, encounter_id);
			if(encounter!=null) {
				List<MedOrders> medOrder=encounter.getMedOrders();
				medOrder.add(medOrders);
				encounter.setMedOrders(medOrder);
				ItemDao itemDao=new ItemDao();
				List<Item> items=medOrders.getItems();
				for (Item item : items) {
					if(EntityFactoryHelp.entityManager.find(Item.class, item.getItem_Id())==null) {
						itemDao.saveItem(item);
					}
				}
				EntityFactoryHelp.entityTransaction.begin();
				EntityFactoryHelp.entityManager.merge(encounter);
				EntityFactoryHelp.entityManager.persist(medOrders);
				EntityFactoryHelp.entityTransaction.commit();
			}
		}
		return medOrders;
		
	}
	
	//update MedOrder in the data
	public MedOrders updateEncounter(String medOrder_id,MedOrders medOrders) {
		if (medOrder_id.equalsIgnoreCase(medOrders.getMedOrder_Id()) && medOrders!= null) {
			EntityFactoryHelp.entityTransaction.begin();
			EntityFactoryHelp.entityManager.merge(medOrders);
			EntityFactoryHelp.entityTransaction.commit();
		}
		return medOrders;
		
	}
	
	//search medOrder from the database
	public MedOrders findOrder(String MedOrder_id) {
		return EntityFactoryHelp.entityManager.find(MedOrders.class, MedOrder_id);
	}
	//remove MedOrder from the database
	public boolean removeMedOrder(String MedOrder_id) {
		
		if(MedOrder_id!=null) {
			MedOrders medOrders=findOrder(MedOrder_id);
			EntityFactoryHelp.entityTransaction.begin();
			EntityFactoryHelp.entityManager.remove(medOrders);
			EntityFactoryHelp.entityTransaction.commit();
			return true;
		}
		return false;	
	}
}
