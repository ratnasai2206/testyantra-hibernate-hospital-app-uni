package com.ty.hospital_app.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {

	@Id
	private String person_Id;
	private String person_Name;
	private int person_Age;
	private String person_BloodGroup;
	private String person_email;
	private long person_phoneNumber;
	private String person_Address;
	@Override
	public String toString() {
		return "Person [person_Id=" + person_Id + ", person_Name=" + person_Name + ", person_Age=" + person_Age
				+ ", person_BloodGroup=" + person_BloodGroup + ", person_email=" + person_email
				+ ", person_phoneNumber=" + person_phoneNumber + ", person_Address=" + person_Address + "]";
	}
	public String getPerson_Id() {
		return person_Id;
	}
	public void setPerson_Id(String person_Id) {
		this.person_Id = person_Id;
	}
	public String getPerson_Name() {
		return person_Name;
	}
	public void setPerson_Name(String person_Name) {
		this.person_Name = person_Name;
	}
	public int getPerson_Age() {
		return person_Age;
	}
	public void setPerson_Age(int person_Age) {
		this.person_Age = person_Age;
	}
	public String getPerson_BloodGroup() {
		return person_BloodGroup;
	}
	public void setPerson_BloodGroup(String person_BloodGroup) {
		this.person_BloodGroup = person_BloodGroup;
	}
	public String getPerson_email() {
		return person_email;
	}
	public void setPerson_email(String person_email) {
		this.person_email = person_email;
	}
	public long getPerson_phoneNumber() {
		return person_phoneNumber;
	}
	public void setPerson_phoneNumber(long person_phoneNumber) {
		this.person_phoneNumber = person_phoneNumber;
	}
	public String getPerson_Address() {
		return person_Address;
	}
	public void setPerson_Address(String person_Address) {
		this.person_Address = person_Address;
	}
	public Person(String person_Id, String person_Name, int person_Age, String person_BloodGroup, String person_email,
			long person_phoneNumber, String person_Address) {

		this.person_Id = person_Id;
		this.person_Name = person_Name;
		this.person_Age = person_Age;
		this.person_BloodGroup = person_BloodGroup;
		this.person_email = person_email;
		this.person_phoneNumber = person_phoneNumber;
		this.person_Address = person_Address;
	}
	public Person() {
		
	}
	@Override
	public int hashCode() {
		return Objects.hash(person_Address, person_Age, person_BloodGroup, person_Id, person_Name, person_email,
				person_phoneNumber);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(person_Address, other.person_Address) && person_Age == other.person_Age
				&& Objects.equals(person_BloodGroup, other.person_BloodGroup)
				&& Objects.equals(person_Id, other.person_Id) && Objects.equals(person_Name, other.person_Name)
				&& Objects.equals(person_email, other.person_email) && person_phoneNumber == other.person_phoneNumber;
	}
	
}
