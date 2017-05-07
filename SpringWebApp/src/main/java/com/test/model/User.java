package com.test.model;

public class User {

	private String name;
	private String zipCode;
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public User(String name, String zipCode, String address) {
		super();
		this.name = name;
		this.zipCode = zipCode;
		this.address = address;
	}

	public User() {
		super();
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", zipCode=" + zipCode + ", address=" + address + "]";
	}

}
