package com;
public class LoginBean {
	private String name, password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean validate() {
		if (name.equals("karthik")&&password.equals("karthik123")) {
			return true;
		} else {
			return false;
		}
	}
}