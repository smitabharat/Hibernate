package com.hefshine.beans;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Person {
	
	@Id
	private int id;
	private String name;
	
	@OneToMany
	@JoinColumn(name="Vehicle_id")
	private List<Vehicle>vehicle=new ArrayList<Vehicle>();
	
	public Person()
	{
		
	}

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	
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

	public List<Vehicle> getVehicle() {
		return vehicle;
	}

	public void setVehicle(List<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", vehicle=" + vehicle + "]";
	}
	

}
