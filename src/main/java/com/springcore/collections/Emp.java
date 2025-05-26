package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Emp {
	private String nameString;
	private List<String> phones;
	private Set<String> addressEStrings;
	private Map<String, String> courses;
	private Properties propsprProperties;

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public List<String> getPhones() {
		return phones;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	public Set<String> getAddressEStrings() {
		return addressEStrings;
	}

	public void setAddressEStrings(Set<String> addressEStrings) {
		this.addressEStrings = addressEStrings;
	}

	public Map<String, String> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

	public Properties getPropsprProperties() {
		return propsprProperties;
	}

	public void setPropsprProperties(Properties propsprProperties) {
		this.propsprProperties = propsprProperties;
	}

	public Emp(String nameString, List<String> phones, Set<String> addressEStrings, Map<String, String> courses,
			Properties propsprProperties) {
		super();
		this.nameString = nameString;
		this.phones = phones;
		this.addressEStrings = addressEStrings;
		this.courses = courses;
		this.propsprProperties = propsprProperties;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emp [nameString=" + nameString + ", phones=" + phones + ", addressEStrings=" + addressEStrings
				+ ", courses=" + courses + ", propsprProperties=" + propsprProperties + "]";
	}

}
