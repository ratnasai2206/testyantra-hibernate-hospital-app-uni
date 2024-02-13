package com.ty.hospital_app.entity;

import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class MedOrders {

	@Id
	private String medOrder_Id;
	private String medOrder_MedicationType;
	private int medOrder_Dosage;
	private String medOrder_PresecribingDoctor;
	private boolean medOrder_IsCompleted;
	@ManyToMany
	private List<Item> items;
	@Override
	public String toString() {
		return "MedOrders [medOrder_Id=" + medOrder_Id + ", medOrder_MedicationType=" + medOrder_MedicationType
				+ ", medOrder_Dosage=" + medOrder_Dosage + ", medOrder_PresecribingDoctor="
				+ medOrder_PresecribingDoctor + ", medOrder_IsCompleted=" + medOrder_IsCompleted + ", items=" + items
				+ "]";
	}
	public MedOrders(String medOrder_Id, String medOrder_MedicationType, int medOrder_Dosage,
			String medOrder_PresecribingDoctor, boolean medOrder_IsCompleted, List<Item> items) {
		this.medOrder_Id = medOrder_Id;
		this.medOrder_MedicationType = medOrder_MedicationType;
		this.medOrder_Dosage = medOrder_Dosage;
		this.medOrder_PresecribingDoctor = medOrder_PresecribingDoctor;
		this.medOrder_IsCompleted = medOrder_IsCompleted;
		this.items = items;
	}
	public MedOrders() {
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(items, medOrder_Dosage, medOrder_Id, medOrder_IsCompleted, medOrder_MedicationType,
				medOrder_PresecribingDoctor);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MedOrders other = (MedOrders) obj;
		return Objects.equals(items, other.items) && medOrder_Dosage == other.medOrder_Dosage
				&& Objects.equals(medOrder_Id, other.medOrder_Id) && medOrder_IsCompleted == other.medOrder_IsCompleted
				&& Objects.equals(medOrder_MedicationType, other.medOrder_MedicationType)
				&& Objects.equals(medOrder_PresecribingDoctor, other.medOrder_PresecribingDoctor);
	}
	public String getMedOrder_Id() {
		return medOrder_Id;
	}
	public void setMedOrder_Id(String medOrder_Id) {
		this.medOrder_Id = medOrder_Id;
	}
	public String getMedOrder_Medication() {
		return medOrder_MedicationType;
	}
	public void setMedOrder_Medication(String medOrder_MedicationType) {
		this.medOrder_MedicationType = medOrder_MedicationType;
	}
	public int getMedOrder_Dosage() {
		return medOrder_Dosage;
	}
	public void setMedOrder_Dosage(int medOrder_Dosage) {
		this.medOrder_Dosage = medOrder_Dosage;
	}
	public String getMedOrder_PresecribingDoctor() {
		return medOrder_PresecribingDoctor;
	}
	public void setMedOrder_PresecribingDoctor(String medOrder_PresecribingDoctor) {
		this.medOrder_PresecribingDoctor = medOrder_PresecribingDoctor;
	}
	public boolean isMedOrder_IsCompleted() {
		return medOrder_IsCompleted;
	}
	public void setMedOrder_IsCompleted(boolean medOrder_IsCompleted) {
		this.medOrder_IsCompleted = medOrder_IsCompleted;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	
	
}
