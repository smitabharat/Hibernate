package com.hefshine.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {

	@Id
	private int id;
	private String name;
	
	@OneToOne
	private Laptop laptop;
	
	
	Student()
	{
		
	}


	public Student(int id, String name, Laptop laptop) {
		super();
		this.id = id;
		this.name = name;
		this.laptop = laptop;
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


	public Laptop getLaptop() {
		return laptop;
	}


	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	
}
