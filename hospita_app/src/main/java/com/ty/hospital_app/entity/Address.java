package com.ty.hospital_app.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
	
	@Id
	private String Address_Id;
	private String Address_StreetName;
	private String Address_CityName;
	private String Address_DistrictName;
	private String Address_StateName;
	private int Address_PinCode;
	@Override
	public String toString() {
		return "Address [Address_Id=" + Address_Id + ", Address_StreetName=" + Address_StreetName
				+ ", Address_CityName=" + Address_CityName + ", Address_DistrictName=" + Address_DistrictName
				+ ", Address_StateName=" + Address_StateName + ", Address_PinCode=" + Address_PinCode + "]";
	}
	public String getAddress_Id() {
		return Address_Id;
	}
	public void setAddress_Id(String address_Id) {
		Address_Id = address_Id;
	}
	public String getAddress_StreetName() {
		return Address_StreetName;
	}
	public void setAddress_StreetName(String address_StreetName) {
		Address_StreetName = address_StreetName;
	}
	public String getAddress_CityName() {
		return Address_CityName;
	}
	public void setAddress_CityName(String address_CityName) {
		Address_CityName = address_CityName;
	}
	public String getAddress_DistrictName() {
		return Address_DistrictName;
	}
	public void setAddress_DistrictName(String address_DistrictName) {
		Address_DistrictName = address_DistrictName;
	}
	public String getAddress_StateName() {
		return Address_StateName;
	}
	public void setAddress_StateName(String address_StateName) {
		Address_StateName = address_StateName;
	}
	
	public int getAddress_PinCode() {
		return Address_PinCode;
	}
	public void setAddress_PinCode(int address_PinCode) {
		Address_PinCode = address_PinCode;
	}
	public Address(String address_Id, String address_StreetName, String address_CityName, String address_DistrictName,
			String address_StateName, int address_PinCode) {
		Address_Id = address_Id;
		Address_StreetName = address_StreetName;
		Address_CityName = address_CityName;
		Address_DistrictName = address_DistrictName;
		Address_StateName = address_StateName;
		Address_PinCode = address_PinCode;
	}
	public Address() {
		
	}
	@Override
	public int hashCode() {
		return Objects.hash(Address_CityName, Address_DistrictName, Address_Id, Address_PinCode, Address_StateName,
				Address_StreetName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return Objects.equals(Address_CityName, other.Address_CityName)
				&& Objects.equals(Address_DistrictName, other.Address_DistrictName)
				&& Objects.equals(Address_Id, other.Address_Id)
				&& Objects.equals(Address_PinCode, other.Address_PinCode)
				&& Objects.equals(Address_StateName, other.Address_StateName)
				&& Objects.equals(Address_StreetName, other.Address_StreetName);
	}
	
}
