package com.global;

import java.util.List;

public class Employee {
	
	private Long id;
	
	private String name;
	
	private int salary;
	
	private List<Address> address; 
	
	private Department department; 
	
	
	

	public Employee(Long id, String name, int salary, Department department , List<Address> address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
		this.department = department;
	}

	public void printName() {
		System.out.println("employee name is >> " + name + " and salary is >> " + salary
				+ " and the department name is >> "  + department.getName());
	
		System.out.print("and the address are >> ");
		for(Address adrs : address) {
			System.out.printf(adrs.getCity() + " ");
		}
		
		System.out.println();
		
	}
	
	public void init() {
		System.out.println("the bean is initialized");
	}
	
	public void cleanUp() {
		System.out.println("the bean is destroyed");
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}
}
