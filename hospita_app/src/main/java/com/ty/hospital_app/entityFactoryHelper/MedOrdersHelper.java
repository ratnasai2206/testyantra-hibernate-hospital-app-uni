package com.ty.hospital_app.entityFactoryHelper;

import java.util.List;
import java.util.Scanner;

import com.ty.hospital_app.entity.Item;
import com.ty.hospital_app.entity.MedOrders;

public class MedOrdersHelper {
	
	static Scanner sc=new Scanner(System.in);
	public static MedOrders getMedOrder() {
		System.out.println("Enter MedOrder ID:");
        String medOrderId = sc.next();

        System.out.println("Enter MedOrder Medication Type:");
        String medOrderMedicationType = sc.next();

        System.out.println("Enter MedOrder Dosage:");
        int medOrderDosage = sc.nextInt();

        System.out.println("Enter MedOrder Prescribing Doctor:");
        String medOrderPrescribingDoctor = sc.next();

        System.out.println("Is MedOrder Completed? (true/false):");
        boolean medOrderIsCompleted = sc.nextBoolean();

        // For simplicity, assume items are added separately after MedOrder creation
        List<Item> items = null;
        return new MedOrders(medOrderId, medOrderMedicationType, medOrderDosage, medOrderPrescribingDoctor, medOrderIsCompleted, items);
	}

}
