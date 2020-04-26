package com.hefshine.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hefshine.beans.Address;
import com.hefshine.beans.Person;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		session.beginTransaction();
		Address address=new Address("pune",411043);
		Person person=new Person(103,"smita","Reddy",address);
		session.save(person);
	
		session.getTransaction().commit();
		session.close();

	}

}
