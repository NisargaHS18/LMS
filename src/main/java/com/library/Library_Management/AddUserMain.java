package com.library.Library_Management;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class AddUserMain {

	

		
		public void add_user_db(String user_name, String Address, int Book1_ID,
				Date Book1_issue,Date Book1_return,int Book2_ID,Date Book2_issue,Date Book2_return )
		{
			
			UserDetails user= new UserDetails();
			user.setUser_name(user_name);
			user.setAddress(Address);
			
			SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionfactory.openSession();
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();
			session.close();
		   user=null;
		}
				

	}



