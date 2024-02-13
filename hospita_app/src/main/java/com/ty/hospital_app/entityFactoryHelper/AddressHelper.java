package com.ty.hospital_app.entityFactoryHelper;

import java.util.Scanner;

import com.ty.hospital_app.entity.Address;

public class AddressHelper {

//	private String Address_Id;
//	private String Address_StreetName;
//	private String Address_CityName;
//	private String Address_DistrictName;
//	private String Address_StateName;
//	private String Address_PinCode;
	
	static Scanner sc=new Scanner(System.in);
	public static Address getAddress() {
		System.out.println("enter the Address_Id ");
		String id=sc.next();
		System.out.println("enter the Address_StreetName ");
		String street=sc.next();
		System.out.println("enter the Address_CityName");
		String city=sc.next();
		System.out.println("enter the Address_DistrictName");
		String district=sc.next();
		System.out.println("enter the Address_StateName");
		String stateName=sc.next();
		System.out.println("enter the Address_PinCode");
		int pinCode=sc.nextInt();
		return new Address(id, street, city, district, stateName, pinCode);
	}
}
