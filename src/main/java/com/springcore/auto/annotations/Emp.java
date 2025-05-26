package com.springcore.auto.annotations;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
	// @Autowired
	private Address address;

	public Address getAddress() {
		return address;
	}

	// @Autowired
	public void setAddress(Address address) {
		System.out.println("setting values");
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("calling consructor");
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

}
