package com.ty.hospital_app.entityFactoryHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import com.ty.hospital_app.entity.Branch;
import com.ty.hospital_app.entity.Hospital;

public class HospitalHelper {
	static Scanner sc=new Scanner(System.in);
	public static Hospital getHospital() {
		System.out.println("enter hospital id");
		String id=sc.next();
		System.out.println("enter hospital name");
		String name=sc.next();
		System.out.println("enter hospital speciality type");
		String type=sc.next();
		System.out.println("enter hospital location");
		String loc=sc.next();
		List<Branch> branch=new ArrayList<Branch>();
		return new Hospital(id, name, type, loc, branch, branch.size());
		
	}
	

}
