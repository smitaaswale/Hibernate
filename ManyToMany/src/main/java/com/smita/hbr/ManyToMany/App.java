package com.smita.hbr.ManyToMany;

import java.util.ArrayList;
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
    	
    	Sport s = new Sport();
    	s.setSid(101);
    	s.setSname("Cricket");
    	
    	Sport s1 = new Sport();
    	s1.setSid(102);
    	s1.setSname("Football");
    	
    	Sport s2 = new Sport();
    	s2.setSid(103);
    	s2.setSname("Hockey");
    	
    	
    	Player p = new Player();
    	p.setPid(1);
    	p.setPname("Sachin");
    	p.setGersey(10);
    	
    	Player p1 = new Player();
    	p1.setPid(2);
    	p1.setPname("Dhoni");
    	p1.setGersey(12);
    	
    	Player p2 = new Player();
    	p2.setPid(3);
    	p2.setPname("Kholi");
    	p2.setGersey(14);
    	
    	
    	List<Sport> sl = new ArrayList();
    	sl.add(s);
    	sl.add(s1);
    	sl.add(s2);
    	
    	List<Player> pl = new ArrayList();
    	pl.add(p);
    	pl.add(p1);
    	pl.add(p2);
    	
    	s.setPl(pl);
    	s1.setPl(pl);
    	s2.setPl(pl);
    	
    	p.setSp(sl);
    	p1.setSp(sl);
    	p2.setSp(sl);
    	
    	
    	
    	
    	Session se = factory.openSession();
    	
    	Transaction t = se.beginTransaction();
    	
    	
    	se.save(s);
    	se.save(s1);
    	se.save(s2);
    	
    	se.save(p);
    	se.save(p1);
    	se.save(p2);


    	
    	t.commit();
    	se.close();
    	factory.close();
    	
    	
    	    }
}
