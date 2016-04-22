package com.javahash.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Silver")
public class Silver  {
	@Id	
	@GeneratedValue
	
	private int id;
	private String name;

	private String image;
	public Silver(){
		
	}
	
	public Silver(String name, String image){

		this.name=name;
	
		this.image=image;
	}
		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}


}
