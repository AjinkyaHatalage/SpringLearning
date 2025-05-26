package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

@Component("s1")
public class Student {
	private Samosa samosa;

	public void study() {
		samosa.display();
		System.out.println("Ajinkya is doing coding");
	}

	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}

	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	@Override
	public String toString() {
		return "Student [samosa=" + samosa + "]";
	}
}
