package com.library.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;
import org.springframework.stereotype.Service;

import com.library.Library_Management.BooksDetails;

@Service
public class SearchService {

	public List<BooksDetails> Search(String text, String by) {

		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		System.out.println("firstline");
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		org.hibernate.Transaction t = session.beginTransaction();
		Query query;
		
		if (by.equals("name")) {
			query = session.createQuery("from BooksDetails d where d.Book_name =:text");
			query.setParameter("text", text);
		} else if (by.equals("author")) {
			query = session.createQuery("from BooksDetails d where d.Book_author =:text");
			query.setParameter("text", text);
		} else if (by.equals("isbn")) {
			int t1 = Integer.parseInt(text);
			query = session.createQuery("from BooksDetails d where d.ISBN =:text");
			query.setParameter("text", t1);
		} else {
			query = session.createQuery("from BooksDetails d where d.language =:text");
			query.setParameter("text", text);
		}

		

		List<BooksDetails> list = query.list();

		System.out.println("Size" + list.size());

		return list;

	}
}
