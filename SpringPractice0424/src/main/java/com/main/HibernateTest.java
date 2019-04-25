package com.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.User;

public class HibernateTest {

	public static void main(String[] args) {
		
		User user = new User(1, "First User", new Date(), "First User Address", "FirstUser Description");

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		System.out.println("Test success. ");
		System.out.println("Test success. ");
		System.out.println("Test success. ");
		System.out.println("Test success. ");
		System.out.println("Test success. ");
	}

}
