package com.springcore.streotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ob")
@Scope("prototype")
public class Student {
	@Value("Ajinkya Hatalage")
	private String studentNameString;

	@Value("Ichalkaranji")
	private String city;
	@Value("#{temp}") /* Spring expressionSpring language */
	private List<String> address;

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	public String getStudentNameString() {
		return studentNameString;
	}

	public void setStudentNameString(String studentNameString) {
		this.studentNameString = studentNameString;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [studentNameString=" + studentNameString + ", city=" + city + "]";
	}

}
