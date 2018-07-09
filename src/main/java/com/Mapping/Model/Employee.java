package com.Mapping.Model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer EmpId;
	@Column
	private String Empname;
	@Column
	private String Empdesg;
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private Address address;
	public Integer getEmpId() {
		return EmpId;
	}
	public void setEmpId(Integer empId) {
		EmpId = empId;
	}
	public String getEmpname() {
		return Empname;
	}
	public void setEmpname(String empname) {
		Empname = empname;
	}
	public String getEmpdesg() {
		return Empdesg;
	}
	public void setEmpdesg(String empdesg) {
		Empdesg = empdesg;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Employee(Integer empId, String empname, String empdesg, Address address) {
		super();
		EmpId = empId;
		Empname = empname;
		Empdesg = empdesg;
		this.address = address;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", Empname=" + Empname + ", Empdesg=" + Empdesg + ", address=" + address
				+ "]";
	}
	
}
