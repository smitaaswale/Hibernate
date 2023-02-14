package com.smita.hbr.OneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.City;
import model.Country;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory = cfg.buildSessionFactory();
    	
    	Country ctr = new Country();
    	ctr.setId(102);
    	ctr.setName("Soth Korea");
    	ctr.setPm("yeung");
    	
    	City cp = new City();
    	cp.setId(11);
    	cp.setName("Seoul");
    	cp.setCo(ctr);
    	
    	City cp1 = new City();
    	cp1.setId(22);
    	cp1.setName("Daegu");
    	
    	
    	
    	List<City> l =new ArrayList();
    	l.add(cp);
    	l.add(cp1);
    	
    	
    	cp1.setCo(ctr);
    	ctr.setCt(l);
    	
    	Session s = factory.openSession();
    	
    	Transaction t = s.beginTransaction();
    	s.save(ctr);
    	s.save(cp);
    	s.save(cp1);
    	
    	t.commit();
    	s.close();
    	factory.close();
    	
    	
    	
    	
    }
}
