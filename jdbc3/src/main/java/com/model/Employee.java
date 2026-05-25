package com.model;

public class Employee {
private int id;
private String name ;
private String designation;
private String company;
private double salary;
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", company=" + company
			+ ", salary=" + salary + "]";
}
public int getId() {
	return id;
}
public void setId(int i) {
	this.id = i;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public Double getSalary() {
	return salary;
}
public void setSalary(double i) {
	this.salary = i;
}

	
}
