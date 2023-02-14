package com.smita.hbr.XMLMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

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
    	
    	Country ctr = new Country();
    	ctr.setId(2);
    	ctr.setName("South Korea");
    	ctr.setLang("Korean");
    	ctr.setPm("Yeaung");
//    	
//    	Capital cp = new Capital();
//    	cp.setCid(11);
//    	cp.setCname("Delhi");
//    	cp.setCo(ctr);
//    	ctr.setCap(cp);
//    	
    	Session s = factory.openSession();
    	
    	
     Transaction t = s.beginTransaction();
    	s.save(ctr);
    	
    	
    	t.commit();
    	s.close();
    	factory.close();
    	
    	
    	    }
}
