package com.bean;

public class BeanImpl {

	private String name;
	private String f_name;
	private String city;
	private String state;	
	
	public BeanImpl(String name, String f_name, String city, String state) {
		this.name = name;
		this.f_name = f_name;
		this.city = city;
		this.state = state;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
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
}