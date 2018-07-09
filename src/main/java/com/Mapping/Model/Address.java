package com.Mapping.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
 private Integer addressId;
	@Column
 private String addressLine;
	@Column
 private String city;
	@Column
 private String state;
	@Column
 private int pincode;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(Integer addressId, String addressLine, String city, String state, int pincode) {
		super();
		this.addressId = addressId;
		this.addressLine = addressLine;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	public String getAddressLine() {
		return addressLine;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", addressLine=" + addressLine + ", city=" + city + ", state="
				+ state + ", pincode=" + pincode + "]";
	}
 
}
