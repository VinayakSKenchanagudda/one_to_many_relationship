package com.ty_one_to_many_uni.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
private String address;
private Long phone;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + ", getId()="
			+ getId() + ", getName()=" + getName() + ", getAddress()=" + getAddress() + ", getPhone()=" + getPhone()
			+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
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
public Long getPhone() {
	return phone;
}
public void setPhone(Long phone) {
	this.phone = phone;
}

}
