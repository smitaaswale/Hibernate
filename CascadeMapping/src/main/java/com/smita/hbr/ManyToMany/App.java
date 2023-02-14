package com.smita.hbr.ManyToMany;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Player;
import model.Sport;

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
    	
    	Sport s =new Sport();
    	s.setSid(101);
    	s.setSname("Cricket");
    	
    	Sport s1 =new Sport();
    	s1.setSid(102);
    	s1.setSname("Football");
    	
    	Sport s2 =new Sport();
    	s2.setSid(103);
    	s2.setSname("Hockey");
    	
    	List<Sport> sl = new ArrayList(Arrays.asList(s,s1,s2));
   	
    	
    	
    	Player p1 =new Player(11, "Dhoni", 11, sl);
    	Player p2 =new Player(22, "Messi", 12, sl);
    	Player p3 =new Player(33, "Sachin", 13, sl);

    	
    	
    	
    	
    	
    	Session se = factory.openSession();
    	
    	Transaction t = se.beginTransaction();
    	
    	se.save(p1);
    	se.save(p2);
    	se.save(p3);
    	

    	
    	t.commit();
    	se.close();
    	factory.close();
    	
    	
    	    }
}
