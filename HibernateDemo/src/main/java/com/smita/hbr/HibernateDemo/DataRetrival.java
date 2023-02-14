package com.smita.hbr.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DataRetrival {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory = cfg.buildSessionFactory();
    	Session session = factory.openSession();

//    	Country co = session.get(Country.class, 8);
//    	System.out.println(co);
    	//System.out.println(co.getName());
    	//
    	//1.get return null if data not present and load will throw exception objectnotfound
    	//2.cache mem/database bring data and for load proxy obj return it fetches obj data when need fron database
    	//faster is load than get
    	//
    	//
    	
    	Country co = session.load(Country.class, 0);
    	System.out.println(co);
    	
//    	Country co = session.getReference(Country.class, 2);
//    	System.out.println(co.getName());
	}

}
