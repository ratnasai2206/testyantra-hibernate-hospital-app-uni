package com.ty.hospital_app.entityFactoryHelper;

import java.util.Scanner;

import com.ty.hospital_app.entity.Item;

public class ItemHelper {
	
	static Scanner scanner=new Scanner(System.in);
	
	public static Item getItem() {
		 System.out.println("Enter Item ID:");
	        String itemId = scanner.next();

	        System.out.println("Enter Item Name:");
	        String itemName = scanner.next();

	        System.out.println("Enter Item Price:");
	        double itemPrice = scanner.nextDouble();
	        scanner.nextLine(); // Consume the newline character

	        System.out.println("Enter Item Manufacturer:");
	        String itemManufacturer = scanner.next();

	        System.out.println("Enter Item Description:");
	        String itemDescription = scanner.next();

	        System.out.println("Enter Item Quantity:");
	        int itemQuantity = scanner.nextInt();
	        scanner.nextLine(); // Consume the newline character

	        System.out.println("Is the Item Available? (true/false):");
	        boolean isAvailable = scanner.nextBoolean();
	        scanner.nextLine(); // Consume the newline character
			return new Item(itemId, itemName, itemPrice, itemManufacturer, itemDescription, itemQuantity, isAvailable);

	        
	}

}
