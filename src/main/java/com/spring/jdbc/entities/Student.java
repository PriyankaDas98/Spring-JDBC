package com.spring.jdbc.entities;

public class Student {
	private int Id;
	private String name;
	private String address;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", name=" + name + ", address=" + address + "]";
	}
	

}
