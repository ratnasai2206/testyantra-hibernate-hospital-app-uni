package com.ty.hospital_app.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item {
	@Id
	private String item_Id;
	private String item_Name;
	private double item_Price;
	private String item_Manufacturer;
	private String item_description;
	private int item_quantity;
	private boolean isAvailable;
	@Override
	public String toString() {
		return "Item [item_Id=" + item_Id + ", item_Name=" + item_Name + ", item_Price=" + item_Price
				+ ", item_Manufacturer=" + item_Manufacturer + ", item_description=" + item_description
				+ ", item_quantity=" + item_quantity + ", isAvailable=" + isAvailable + "]";
	}
	public String getItem_Id() {
		return item_Id;
	}
	public void setItem_Id(String item_Id) {
		this.item_Id = item_Id;
	}
	public String getItem_Name() {
		return item_Name;
	}
	public void setItem_Name(String item_Name) {
		this.item_Name = item_Name;
	}
	public double getItem_Price() {
		return item_Price;
	}
	public void setItem_Price(double item_Price) {
		this.item_Price = item_Price;
	}
	public String getItem_Manufacturer() {
		return item_Manufacturer;
	}
	public void setItem_Manufacturer(String item_Manufacturer) {
		this.item_Manufacturer = item_Manufacturer;
	}
	public String getItem_description() {
		return item_description;
	}
	public void setItem_description(String item_description) {
		this.item_description = item_description;
	}
	public int getItem_quantity() {
		return item_quantity;
	}
	public void setItem_quantity(int item_quantity) {
		this.item_quantity = item_quantity;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	public Item(String item_Id, String item_Name, double item_Price, String item_Manufacturer, String item_description,
			int item_quantity, boolean isAvailable) {
		this.item_Id = item_Id;
		this.item_Name = item_Name;
		this.item_Price = item_Price;
		this.item_Manufacturer = item_Manufacturer;
		this.item_description = item_description;
		this.item_quantity = item_quantity;
		this.isAvailable = isAvailable;
	}
	public Item() {
		
	}
	@Override
	public int hashCode() {
		return Objects.hash(isAvailable, item_Id, item_Manufacturer, item_Name, item_Price, item_description,
				item_quantity);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return isAvailable == other.isAvailable && Objects.equals(item_Id, other.item_Id)
				&& Objects.equals(item_Manufacturer, other.item_Manufacturer)
				&& Objects.equals(item_Name, other.item_Name)
				&& Double.doubleToLongBits(item_Price) == Double.doubleToLongBits(other.item_Price)
				&& Objects.equals(item_description, other.item_description) && item_quantity == other.item_quantity;
	}
	
}
