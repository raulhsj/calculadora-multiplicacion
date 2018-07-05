package com.ust.calc.bean;

public class InputBean {

	private Integer one;
	private Integer two;
	
	public Integer getOne() {
		return one;
	}
	public void setOne(Integer one) {
		this.one = one;
	}
	public Integer getTwo() {
		return two;
	}
	public void setTwo(Integer two) {
		this.two = two;
	}
	@Override
	public String toString() {
		return "InputBean [one=" + one + ", two=" + two + "]";
	}	
	
}
