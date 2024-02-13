package com.ty.hospital_app.entityFactoryHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ty.hospital_app.entity.Address;
import com.ty.hospital_app.entity.Branch;
import com.ty.hospital_app.entity.Encounter;

public class BranchHelper {
	static Scanner sc=new Scanner(System.in);
	public static Branch getBranch() { 
		System.out.println("enter branch id");
		String id=sc.next();
		System.out.println("enter branch name");
		String name=sc.next();
		System.out.println("enter branch capacity");
		int capacity=sc.nextInt();
		System.out.println("enter branch email");
		String email=sc.next();
		System.out.println("enter branch no of doctors");
		int no_of_doc=sc.nextInt();
		System.out.println("enter the branch phone number ");
		long phone=sc.nextLong();
		System.out.println("enter branch speciality");
		String type=sc.next();
		Address address=AddressHelper.getAddress();
		List<Encounter> encounter=new ArrayList<>();
		return new Branch(id, name, capacity, email, no_of_doc, phone, type, address, encounter, no_of_doc);
	}
}
