package com.springcore.ci;

public class Additon {
	private int a;
	private int b;

	public Additon(double a, double b) {
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("Constructor: double,double");
	}

	public Additon(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("Constructor: int,int");
	}

	public Additon(String a, String b) {

		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("Constructor: String,String");

	}

	public void doSum() {
		System.out.println("value of a and b are:" + a + "," + b);
		System.out.println("Sum is :  " + (this.a + this.b));
	}
}
