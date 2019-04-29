package com.library.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.springframework.stereotype.Service;

import com.library.Library_Management.BooksDetails;

@Service
public class AddBookService {

	public void addbook(BooksDetails b) {
		
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		System.out.println("firstline");
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		org.hibernate.Transaction t = session.beginTransaction();
		
		System.out.println(b.getBook_name());
		
		session.save(b);
		t.commit();
		System.out.println("Successfully saved");
		factory.close();
		session.close();
		
	}
}

