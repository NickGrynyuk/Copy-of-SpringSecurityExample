package com.javahash.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Client extends BaseEntity{
	
	private String name;
	private String password;
	private String lname;
	private String fname;
	private String email;
	private String image;
	private int norders;
	
	
	
	public Client(){}
	
	public Client(String name, String lname, String fname, String password,	String image, String email) {
		this.name=name;
		this.lname=lname;
		this.fname=fname;
		this.password=password;
		this.email=email;
		this.image=image;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
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
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getNorders() {
		return norders;
	}
	public void setNorders(int norders) {
		this.norders = norders;
	}
}
