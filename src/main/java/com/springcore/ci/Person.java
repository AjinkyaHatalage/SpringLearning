package com.springcore.ci;

public class Person {
	private String name;
	private int persioId;
	private Certi certi;

	public Person(String name, int personId, Certi certi) {
		this.name = name;
		this.persioId = personId;
		this.certi = certi;
	}

	@Override
	public String toString() {
		return this.name + "  :" + this.persioId + " { " + this.certi + "}";
	}
}
