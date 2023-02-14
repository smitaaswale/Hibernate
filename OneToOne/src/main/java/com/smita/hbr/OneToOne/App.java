package com.smita.hbr.OneToOne;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import model.Capital;
import model.Country;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// TODO Auto-generated method stub
    			Configuration cfg = new Configuration();
    	    	cfg.configure("hibernate.cfg.xml");
    	    	SessionFactory factory = cfg.buildSessionFactory();
    	    	
//    	    	Country ctr = new Country();
//    	    	ctr.setId(2);
//    	    	ctr.setName("India");
//    	    	ctr.setPm("Modi");
//    	    	
//    	    	Capital cp = new Capital();
//    	    	cp.setCid(11);
//    	    	cp.setCname("Delhi");
//    	    	cp.setCo(ctr);
//    	    	ctr.setCap(cp);
//    	    	
    	    	Session s = factory.openSession();
    	    	
//    	    	Country c = s.get(Country.class,1);
//    	    	System.out.println(c.getCap().getCname());
    	    	
//    	    	Transaction t = s.beginTransaction();
//    	    	s.save(ctr);
//    	    	s.save(cp);`
//    	    	
//    	    	t.commit();
    	    	
    	    	String HQL ="select c.id,c.name,c.pm,ci.cname from Country as c inner join c.cap as ci";
    	    	Query q = s.createQuery(HQL);
    	    	List<Object[]> li =q.list();
    	    	for(Object[] c:li) {
    	    	System.out.println(Arrays.toString(c));
    	    	}
    	    	s.close();
    	    	factory.close();
    	    	
    	    	
    	    	
    	    	
    	    	
    	    	
    	    	
    	    	
    	    	
    	    	    }
}
