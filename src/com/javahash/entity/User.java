package com.javahash.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;

import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User extends BaseEntity{

	private String name;
	private String password;
	private String lname;
	private String fname;
	private String email;
	private String image;
	private int norders;
	@ManyToMany(cascade = {CascadeType.ALL}, fetch=FetchType.EAGER)
	@JoinTable (name="roles_users", joinColumns={@JoinColumn(name="user_id", nullable = false, updatable = false)}, 
		inverseJoinColumns={@JoinColumn(name="role_id", nullable = false, updatable = false)})
	private List<Role> roles;
	
	

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
	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
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
