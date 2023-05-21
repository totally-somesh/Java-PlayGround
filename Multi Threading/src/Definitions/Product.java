package Definitions;

import java.io.Serializable;
import java.time.LocalDate;

import Definitions.*;

@SuppressWarnings("unused")
public class Product implements Serializable {

	private int productID;
	private String name;
	private String description;
	private int quantity;
	private double price;
	private Category productCategory;
	private LocalDate manufactureDate;

	public Product(int productID, String name, String description, int quantity, double price,
			Category productCategory, LocalDate manufactureDate) {
		super();
		this.productID = productID;
		this.name = name;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
		this.productCategory = productCategory;
		this.manufactureDate = manufactureDate;
	}// parameterized constructor

	public String toString() {

		return " |ProductID : " + productID + " |Name : " + name + " |Price : " + price + " | Quantity : " + quantity
				+ " |Category : " + productCategory + " |Manufacturing Date : " + manufactureDate + " | Description : "
				+ description;
	}//toString

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Category getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(Category productCategory) {
		this.productCategory = productCategory;
	}

	public LocalDate getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
}// class
