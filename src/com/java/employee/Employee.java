package com.java.employee;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Employee {
	 
    private int id;
    private String empName;
    private String address;
 
    public Employee() {
 
    }
    

	public Employee(int id, String empName, String address) {
		this.id = id;
		this.empName = empName;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", address=" + address + "]";
	}


	public int getId() {
		return id;
	}

	
	public void setId(int id) {
		this.id = id;
	}

	
	public String getEmpName() {
		return empName;
	}

	
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
 
    