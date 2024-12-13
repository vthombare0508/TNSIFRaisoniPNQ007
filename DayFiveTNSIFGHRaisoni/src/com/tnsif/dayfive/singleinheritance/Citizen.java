package com.tnsif.dayfive.singleinheritance;

public class Citizen {

	private String name;
	private String aadharNo;
	private String address;
	private String phno;
	
	public Citizen()
	{
		System.out.println("Citizen object created");
	}
	
	public Citizen(String name, String aadharNo, String address, String phno)
	{
		this.name= name;
		this.aadharNo=aadharNo;
		this.address= address;
		this.phno=phno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhno() {
		return phno;
	}

	public void setPhno(String phno) {
		this.phno = phno;
	}

	@Override
	public String toString() {
		return "Citizen [name=" + name + ", aadharNo=" + aadharNo + ", address=" + address + ", phno=" + phno + "]";
	}
	
	
	
	
	
}
