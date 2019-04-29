package com.library.service;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.springframework.stereotype.Service;

import com.library.Library_Management.UserDetails;

@Service
public class AddUserService {


public void adduser(UserDetails c) {
		
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		System.out.println("firstline");
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		org.hibernate.Transaction t = session.beginTransaction();
		
		
		session.save(c);
		t.commit();
		System.out.println("Successfully saved");
		factory.close();
		session.close();
		
	}
}
