package com.ty.hospital_app.entityFactoryHelper;

import java.util.Scanner;

import com.ty.hospital_app.entity.Person;

public class PersonHelper {
	static Scanner sc=new Scanner(System.in);

	public static Person getPerson() {
		System.out.println("Enter Person ID:");
        String personId = sc.next();

        System.out.println("Enter Person Name:");
        String personName = sc.next();

        System.out.println("Enter Person Age:");
        int personAge = sc.nextInt();

        System.out.println("Enter Person Blood Group:");
        String personBloodGroup = sc.next();

        System.out.println("Enter Person Email:");
        String personEmail = sc.next();

        System.out.println("Enter Person Phone Number:");
        long personPhoneNumber = sc.nextLong();

        System.out.println("Enter Person Address:");
        String personAddress = sc.next();
        return new Person(personId, personName, personAge, personBloodGroup, personEmail, personPhoneNumber, personAddress);
	}
}
