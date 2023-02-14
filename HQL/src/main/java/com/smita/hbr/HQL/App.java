package com.smita.hbr.HQL;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import model.Country;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
    {
SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	
//    	Country ctr = new Country();
//    	ctr.setId(2);
//    	ctr.setName("USA");
//    	ctr.setLang("English");
//    	ctr.setPm("Joe");
//    	
//    	Capital cp = new Capital();
//    	cp.setCid(11);
//    	cp.setCname("Delhi");
//    	cp.setCo(ctr);
//    	ctr.setCap(cp);
//    	
    	Session s = factory.openSession();
    	
    	
//     Transaction t = s.beginTransaction();
//    	s.save(ctr);
//    	t.commit();
    	
    	String HQL ="from Country";
    	Query q = s.createQuery(HQL);
    	List<Country> l = q.list();
    	
    	for(Country c:l) {
    		System.out.println(c.getName());
    	}
    	
    	
    	
    	s.close();
    	factory.close();
    	
    	    }
}
