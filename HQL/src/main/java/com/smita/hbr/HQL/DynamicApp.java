package com.smita.hbr.HQL;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import model.Country;

public class DynamicApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	

    	Session s = factory.openSession();
    	
    	

//    	Static Query
//    	String HQL ="from Country";
//    	Query q = s.createQuery(HQL);
//    	List<Country> l = q.list();
    	
//    	String HQL ="from Country where pm=:x";
//    	Query q = s.createQuery(HQL);
//    	q.setParameter("x", "Modi");
    	
    	
//    	List<Country> l = q.list();
//    	Object result = q.uniqueResult();
//    	Country result =(Country) q.uniqueResult();
//
//    	System.out.println(result.getName());
//    	
//    	for(Country c:l) {
//    		System.out.println(c.getName());
//    	}
    	
//    	String HQL ="from Country where pm=:x or lang=:y";
//    	Query q = s.createQuery(HQL);
//    	q.setParameter("x", "Modi");
//    	q.setParameter("y", "Korean");
//    	List<Country> l = q.list();
//    	int s1 = l.size();
//    	
//    	for(int i=0;  i<s1; i++) {
//    		System.out.println(l.get(i).getName());
//    	}
    	
    	
//    	String HQL ="select name from Country where pm=:x";
//    	Query q = s.createQuery(HQL);
//    	q.setParameter("x", "Modi");
//    	
//    	String result =(String) q.uniqueResult();
//    	    	
//    	System.out.println(result);
//    	
    	
//    	String HQL ="select count(id) from Country ";
//    	Query q = s.createQuery(HQL);
//    	Long co = (Long) q.uniqueResult();
//    	System.out.println(co);
    	
    	
    	Transaction tr = s.beginTransaction();
    	
//    	String HQL ="update Country set name='japan' where id=3";
//    	Query q = s.createQuery(HQL);
//    	int i = q.executeUpdate();
//    	System.out.println("Count update"+i);
    	
//    	String HQL ="update Country set pm=:x where id=:y";
//    	Query q = s.createQuery(HQL);
//    	q.setParameter("x", "kungfu");
//    	q.setParameter("y", 3);
//    	int i = q.executeUpdate();
//    	System.out.println("Count update"+i);
//    	
    	
//    	String HQL ="delete from Country where id=:y";
//    	Query q = s.createQuery(HQL);
//    	q.setParameter("y", 4);
//    	int i = q.executeUpdate();
//    	System.out.println("Count deleted"+i);
    	
    	tr.commit();
    	
    	String HQL ="update Country set pm=:x where id=:y";
    	Query q = s.createQuery(HQL);
    	q.setParameter("x", "kungfu");
    	q.setParameter("y", 3);
    	int i = q.executeUpdate();
    	System.out.println("Count update"+i);
    	
    	
    	
    	s.close();
    	factory.close();
    	
	}

}
