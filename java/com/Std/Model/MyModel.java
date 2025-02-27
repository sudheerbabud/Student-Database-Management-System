package com.Std.Model;

public class MyModel {
	private String username;
	private String password;
	private String email;
	private String phonenumber;

	public MyModel(String username, String password, String email, String phonenumber) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.phonenumber = phonenumber;
	}

	public MyModel() {
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	@Override
	public String toString() {
		return "MyprojectModel [username=" + username + ", password=" + password + ", email=" + email + ", phonenumber="
				+ phonenumber + "]";
	}

}