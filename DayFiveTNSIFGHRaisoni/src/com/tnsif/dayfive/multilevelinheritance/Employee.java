package com.tnsif.dayfive.multilevelinheritance;

import java.util.Date;

public class Employee extends Person{
	
	private String deptName;
	private double baseSalary;
	private String name;
	
	
	
	public Employee(String name, long contactNo, Date dateOfBirth, String deptName, double baseSalary)
	{
		super(name, contactNo,dateOfBirth);
		this.deptName = deptName;
		this.baseSalary = baseSalary;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	@Override
	public String toString() {
		return "Employee [deptName=" + deptName + ", baseSalary=" + baseSalary + ", getName()=" + getName()
				+ ", getContactNo()=" + getContactNo() + ", getDateOfBirth()=" + getDateOfBirth() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
  
}







