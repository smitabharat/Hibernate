package com.hefshine.test;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hefshine.beans.Person;

public class Test {

	public static void main(String[] args)
	{
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		session.beginTransaction();
		
		String sql="from Person";
		Query query=session.createQuery(sql);
		
		//query.setFirstResult(1);
		//query.setMaxResults(5);
		List<Person>list=query.getResultList();
		for(Person person:list)
		{
			System.out.println(person);
		}
		session.getTransaction().commit();
		session.close();


	}

}
