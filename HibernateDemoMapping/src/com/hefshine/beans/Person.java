package com.hefshine.beans;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class Person {

	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "firstname")
	private String firstname;

	@Column(name = "lastname")
	private String lastname;

	@Column(name = "city")
	private String city;

	@ElementCollection
	private List<String> movie;

	public Person() {

	}

	public Person(int id, String firstname, String lastname, String city, List<String> movie) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.city = city;
		this.movie = movie;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<String> getMovie() {
		return movie;
	}

	public void setMovie(List<String> movie) {
		this.movie = movie;
	}

}
