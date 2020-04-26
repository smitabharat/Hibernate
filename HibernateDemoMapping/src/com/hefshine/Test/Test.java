package com.hefshine.Test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hefshine.beans.Person;

public class Test {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		List<String> movie = new ArrayList<String>();
		movie.add("Nal");
		movie.add("Mulshi Pattern");

		Person person = new Person(13, "Smit", "Bharat", "Shevgaon", movie);
		
		session.save(person);
		session.getTransaction().commit();
		session.close();
	}

}
