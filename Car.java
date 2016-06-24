package com.primefaces.bean;

import java.io.Serializable;

public class Car implements Serializable{

	private String id ;
	private String brand ;
	private int year ;
	private String color ;
	private int price ;
	private boolean state;
	private String sold ;
	public Car() {
		// TODO Auto-generated constructor stub
	}
	public  Car(String id, String brand, int year, String color, int price , boolean state) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.brand=brand;
		this.year=year;
		this.color=color;
		this.price=price;
		this.state=state;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	public String getSold() {
		return sold;
	}
	public void setSold(String sold) {
		this.sold = sold;
	}
}
