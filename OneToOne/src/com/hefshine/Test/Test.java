package com.hefshine.Test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hefshine.beans.Laptop;
import com.hefshine.beans.Student;

public class Test {

	public static void main(String[] args) 
	{
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		
		Session session=factory.openSession();
		session.beginTransaction();
		
		Laptop laptop=new Laptop(1,"Dell");
		Student student=new Student(23,"SB",laptop);
		
		session.save(student);
		session.save(laptop);
		
		session.getTransaction().commit();
		session.close();

	}

}
