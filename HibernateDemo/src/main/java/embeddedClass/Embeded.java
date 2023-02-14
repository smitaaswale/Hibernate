package embeddedClass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.smita.hbr.HibernateDemo.Country;

public class Embeded {
	public static void main(String[] args) {
		
		
		Configuration cfg = new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory = cfg.buildSessionFactory();
    	
    	WC ctr =new WC();
    	ctr.setId(22);
    	ctr.setName("South Korea");
    	ctr.setPm("yueng");
    	
    	Capital cp = new Capital();
    	cp.setCid(02);
    	cp.setCname("Seol");
    	
    	ctr.setCap(cp);
    	
    	
    	Session session = factory.openSession();
    	Transaction transaction = session.beginTransaction();
    	
    	session.save(ctr);
    	
    	
    	transaction.commit();
    	session.close();
    	factory.close();
    	
	}

}
