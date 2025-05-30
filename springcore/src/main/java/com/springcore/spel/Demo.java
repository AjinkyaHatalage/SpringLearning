package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("aj")
public class Demo {
	@Value("#{22+11}")
	private int x;
	@Value("#{2>1?10:20}")
	private int y;
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private double z;
	@Value("#{T(java.lang.Boolean).TRUE}")
	private Boolean flagBoolean;

	public Boolean getFlagBoolean() {
		return flagBoolean;
	}

	public void setFlagBoolean(Boolean flagBoolean) {
		this.flagBoolean = flagBoolean;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", flagBoolean=" + flagBoolean + "]";
	}
}
