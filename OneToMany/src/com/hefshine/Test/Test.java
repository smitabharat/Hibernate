package com.hefshine.Test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hefshine.beans.Person;
import com.hefshine.beans.Vehicle;

public class Test {

	public static void main(String[] args)
	{
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		session.beginTransaction();
		//Person person=new Person(14,"smitadon");
		
		
		
		List<Vehicle> vehicles=new ArrayList<Vehicle>();
		vehicles.add(new Vehicle(5,"swift"));
		vehicles.add(new Vehicle(2,"jaguar"));
		
//		person.setId(45);
//		person.setName("smita");
//		person.setVehicle(vehicles);
//		
		session.save(vehicles);
		for(Vehicle vehicle1:vehicles)
		{
			session.save(vehicle1);
		}
		
		session.getTransaction().commit();
		session.close();

	}

}
