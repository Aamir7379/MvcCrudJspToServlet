package com.Bean;

public class User {
private int id;
private String name;
private String Address;
private String Dob;
private String course;
private String joing;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", Address=" + Address + ", Dob=" + Dob + ", course=" + course
			+ ", joing=" + joing + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public String getDob() {
	return Dob;
}
public void setDob(String dob) {
	Dob = dob;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public String getJoing() {
	return joing;
}
public void setJoing(String joing) {
	this.joing = joing;
}

}
