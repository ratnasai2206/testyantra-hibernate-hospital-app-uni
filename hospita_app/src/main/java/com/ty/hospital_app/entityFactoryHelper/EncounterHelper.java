package com.ty.hospital_app.entityFactoryHelper;

import java.util.List;
import java.util.Scanner;

import com.ty.hospital_app.entity.Encounter;
import com.ty.hospital_app.entity.MedOrders;
import com.ty.hospital_app.entity.Person;

public class EncounterHelper {

	static Scanner sc=new Scanner(System.in);
	public static Encounter getEncounter() {
		 System.out.println("Enter Encounter ID:");
	        String encounterId = sc.next();

	        System.out.println("Enter Encounter Description:");
	        String encounterDescription = sc.next();

	        System.out.println("Enter Encounter Chief Complaint:");
	        String encounterChiefComplaint = sc.next();

	        System.out.println("Enter Encounter Consult Department:");
	        String encounterConsultDepartment = sc.next();

	        System.out.println("Is Encounter Serious? (true/false):");
	        boolean encounterIsSerious = sc.nextBoolean();

	        // For simplicity, assume person and medOrders are added separately after Encounter creation
	        Person person = null;
	        List<MedOrders> medOrders = null;
	        return new Encounter(encounterId, encounterDescription, encounterChiefComplaint, encounterConsultDepartment, encounterIsSerious, person, medOrders);
	}
}
