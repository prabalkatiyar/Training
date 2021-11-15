package com.app.rapipay.SpringBootApp1.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sum {
	
	@Id
	private int num1;
	private int num2;
	public Sum() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	@Override
	public String toString() {
		return "Sum [num1=" + num1 + ", num2=" + num2 + "]";
	}
	public Sum(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
	

}
