package com.ty.hospital_app.entity;

import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Branch {
	
	@Id
	private String branch_Id;
	private String branch_Name;
	private int branch_Capacity;
	private String branch_EmailId;
	private int branch_No_Of_Doctors;
	private long branch_PhoneNumber;
	private String branch_Speciality;
	@OneToOne
	private Address address;
	@OneToMany
	private List<Encounter> encounters;
	private int branch_NoOfEncounters;
	@Override
	public String toString() {
		return "Branch [branch_Id=" + branch_Id + ", branch_Name=" + branch_Name + ", branch_Capacity="
				+ branch_Capacity + ", branch_EmailId=" + branch_EmailId + ", branch_No_Of_Doctors="
				+ branch_No_Of_Doctors + ", branch_PhoneNumber=" + branch_PhoneNumber + ", branch_Speciality="
				+ branch_Speciality + ", address=" + address + ", encounters=" + encounters + ", branch_NoOfEncounters="
				+ branch_NoOfEncounters + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, branch_Capacity, branch_EmailId, branch_Id, branch_Name, branch_NoOfEncounters,
				branch_No_Of_Doctors, branch_PhoneNumber, branch_Speciality, encounters);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Branch other = (Branch) obj;
		return Objects.equals(address, other.address) && branch_Capacity == other.branch_Capacity
				&& Objects.equals(branch_EmailId, other.branch_EmailId) && Objects.equals(branch_Id, other.branch_Id)
				&& Objects.equals(branch_Name, other.branch_Name)
				&& branch_NoOfEncounters == other.branch_NoOfEncounters
				&& branch_No_Of_Doctors == other.branch_No_Of_Doctors && branch_PhoneNumber == other.branch_PhoneNumber
				&& Objects.equals(branch_Speciality, other.branch_Speciality)
				&& Objects.equals(encounters, other.encounters);
	}
	public String getBranch_Id() {
		return branch_Id;
	}
	public void setBranch_Id(String branch_Id) {
		this.branch_Id = branch_Id;
	}
	public String getBranch_Name() {
		return branch_Name;
	}
	public void setBranch_Name(String branch_Name) {
		this.branch_Name = branch_Name;
	}
	public int getBranch_Capacity() {
		return branch_Capacity;
	}
	public void setBranch_Capacity(int branch_Capacity) {
		this.branch_Capacity = branch_Capacity;
	}
	public String getBranch_EmailId() {
		return branch_EmailId;
	}
	public void setBranch_EmailId(String branch_EmailId) {
		this.branch_EmailId = branch_EmailId;
	}
	public int getBranch_No_Of_Doctors() {
		return branch_No_Of_Doctors;
	}
	public void setBranch_No_Of_Doctors(int branch_No_Of_Doctors) {
		this.branch_No_Of_Doctors = branch_No_Of_Doctors;
	}
	public long getBranch_PhoneNumber() {
		return branch_PhoneNumber;
	}
	public void setBranch_PhoneNumber(long branch_PhoneNumber) {
		this.branch_PhoneNumber = branch_PhoneNumber;
	}
	public String getBranch_Speciality() {
		return branch_Speciality;
	}
	public void setBranch_Speciality(String branch_Speciality) {
		this.branch_Speciality = branch_Speciality;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Encounter> getEncounters() {
		return encounters;
	}
	public void setEncounters(List<Encounter> encounters) {
		this.encounters = encounters;
	}
	public int getBranch_NoOfEncounters() {
		return branch_NoOfEncounters;
	}
	public void setBranch_NoOfEncounters(int branch_NoOfEncounters) {
		this.branch_NoOfEncounters = branch_NoOfEncounters;
	}
	public Branch(String branch_Id, String branch_Name, int branch_Capacity, String branch_EmailId,
			int branch_No_Of_Doctors, long branch_PhoneNumber, String branch_Speciality, Address address,
			List<Encounter> encounters, int branch_NoOfEncounters) {
		super();
		this.branch_Id = branch_Id;
		this.branch_Name = branch_Name;
		this.branch_Capacity = branch_Capacity;
		this.branch_EmailId = branch_EmailId;
		this.branch_No_Of_Doctors = branch_No_Of_Doctors;
		this.branch_PhoneNumber = branch_PhoneNumber;
		this.branch_Speciality = branch_Speciality;
		this.address = address;
		this.encounters = encounters;
		this.branch_NoOfEncounters = branch_NoOfEncounters;
	}
	public Branch() {
		
	}
	

}
