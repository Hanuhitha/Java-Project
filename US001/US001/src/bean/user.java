package bean;

import java.util.Date;

//import util.dateutil;

public class user
{
	String fname;
	String lname;
	Date dob;
	
	String email;
	int phonenum;
	String UserId;
	String Squestion;
	String Sanswer;
	String password;
	String role;
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(int phonenum) {
		this.phonenum = phonenum;
	}
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public String getSquestion() {
		return Squestion;
	}
	public void setSquestion(String squestion) {
		Squestion = squestion;
	}
	public String getSanswer() {
		return Sanswer;
	}
	public void setSanswer(String sanswer) {
		Sanswer = sanswer;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
