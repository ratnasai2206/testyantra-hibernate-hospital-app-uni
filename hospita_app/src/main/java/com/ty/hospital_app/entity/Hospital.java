package com.ty.hospital_app.entity;

import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Hospital {

	@Id
	private String hospital_Id;
	private String hospital_Name;
	private String hospital_Speciality;
	private String hospital_Location;
	@OneToMany
	private List<Branch> branch;
	private int no_Of_Branch;
	@Override
	public String toString() {
		return "Hospital [hospital_Id=" + hospital_Id + ", hospital_Name=" + hospital_Name + ", hospital_Speciality="
				+ hospital_Speciality + ", hospital_Location=" + hospital_Location + ", branch=" + branch
				+ ", no_Of_Branch=" + no_Of_Branch + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(branch, hospital_Id, hospital_Location, hospital_Name, hospital_Speciality, no_Of_Branch);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hospital other = (Hospital) obj;
		return Objects.equals(branch, other.branch) && Objects.equals(hospital_Id, other.hospital_Id)
				&& Objects.equals(hospital_Location, other.hospital_Location)
				&& Objects.equals(hospital_Name, other.hospital_Name)
				&& Objects.equals(hospital_Speciality, other.hospital_Speciality) && no_Of_Branch == other.no_Of_Branch;
	}
	public String getHospital_Id() {
		return hospital_Id;
	}
	public void setHospital_Id(String hospital_Id) {
		this.hospital_Id = hospital_Id;
	}
	public String getHospital_Name() {
		return hospital_Name;
	}
	public void setHospital_Name(String hospital_Name) {
		this.hospital_Name = hospital_Name;
	}
	public String getHospital_Speciality() {
		return hospital_Speciality;
	}
	public void setHospital_Speciality(String hospital_Speciality) {
		this.hospital_Speciality = hospital_Speciality;
	}
	public String getHospital_Location() {
		return hospital_Location;
	}
	public void setHospital_Location(String hospital_Location) {
		this.hospital_Location = hospital_Location;
	}
	public List<Branch> getBranch() {
		return branch;
	}
	public void setBranch(List<Branch> branch) {
		this.branch = branch;
	}
	public int getNo_Of_Branch() {
		return no_Of_Branch;
	}
	public void setNo_Of_Branch(int no_Of_Branch) {
		this.no_Of_Branch = no_Of_Branch;
	}
	public Hospital(String hospital_Id, String hospital_Name, String hospital_Speciality, String hospital_Location,
			List<Branch> branch, int no_Of_Branch) {
		this.hospital_Id = hospital_Id;
		this.hospital_Name = hospital_Name;
		this.hospital_Speciality = hospital_Speciality;
		this.hospital_Location = hospital_Location;
		this.branch = branch;
		this.no_Of_Branch = no_Of_Branch;
	}
	public Hospital() {
		
	}
}
