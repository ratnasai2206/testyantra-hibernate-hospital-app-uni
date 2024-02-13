package com.ty.hospital_app.entity;

import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Encounter {

	@Id
	private String encounter_Id;
	private String encounter_Description;
	private String encounter_ChiefComplaint;
	private String encounter_consultDepartment;
	private boolean encounter_isSerious;
	@ManyToOne
	private Person person;
	@OneToMany
	private List<MedOrders> medOrders;
	@Override
	public String toString() {
		return "Encounter [encounter_Id=" + encounter_Id + ", encounter_Description=" + encounter_Description
				+ ", encounter_ChiefComplaint=" + encounter_ChiefComplaint + ", encounter_consultDepartment="
				+ encounter_consultDepartment + ", encounter_isSerious=" + encounter_isSerious + ", person=" + person
				+ ", medOrders=" + medOrders + "]";
	}
	public String getEncounter_Id() {
		return encounter_Id;
	}
	public void setEncounter_Id(String encounter_Id) {
		this.encounter_Id = encounter_Id;
	}
	public String getEncounter_Description() {
		return encounter_Description;
	}
	public void setEncounter_Description(String encounter_Description) {
		this.encounter_Description = encounter_Description;
	}
	public String getEncounter_ChiefComplaint() {
		return encounter_ChiefComplaint;
	}
	public void setEncounter_ChiefComplaint(String encounter_ChiefComplaint) {
		this.encounter_ChiefComplaint = encounter_ChiefComplaint;
	}
	public String getEncounter_consultDepartment() {
		return encounter_consultDepartment;
	}
	public void setEncounter_consultDepartment(String encounter_consultDepartment) {
		this.encounter_consultDepartment = encounter_consultDepartment;
	}
	public boolean isEncounter_isSerious() {
		return encounter_isSerious;
	}
	public void setEncounter_isSerious(boolean encounter_isSerious) {
		this.encounter_isSerious = encounter_isSerious;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public List<MedOrders> getMedOrders() {
		return medOrders;
	}
	public void setMedOrders(List<MedOrders> medOrders) {
		this.medOrders = medOrders;
	}
	public Encounter(String encounter_Id, String encounter_Description, String encounter_ChiefComplaint,
			String encounter_consultDepartment, boolean encounter_isSerious, Person person, List<MedOrders> medOrders) {
		this.encounter_Id = encounter_Id;
		this.encounter_Description = encounter_Description;
		this.encounter_ChiefComplaint = encounter_ChiefComplaint;
		this.encounter_consultDepartment = encounter_consultDepartment;
		this.encounter_isSerious = encounter_isSerious;
		this.person = person;
		this.medOrders = medOrders;
	}
	public Encounter() {
		
	}
	@Override
	public int hashCode() {
		return Objects.hash(encounter_ChiefComplaint, encounter_Description, encounter_Id, encounter_consultDepartment,
				encounter_isSerious, medOrders, person);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Encounter other = (Encounter) obj;
		return Objects.equals(encounter_ChiefComplaint, other.encounter_ChiefComplaint)
				&& Objects.equals(encounter_Description, other.encounter_Description)
				&& Objects.equals(encounter_Id, other.encounter_Id)
				&& Objects.equals(encounter_consultDepartment, other.encounter_consultDepartment)
				&& encounter_isSerious == other.encounter_isSerious && Objects.equals(medOrders, other.medOrders)
				&& Objects.equals(person, other.person);
	}
	
	
}
