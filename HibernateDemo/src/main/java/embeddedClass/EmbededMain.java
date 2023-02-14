package embeddedClass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbededMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory = cfg.buildSessionFactory();
    	Session s = factory.openSession();
    	
    	Fruit fr = new Fruit();
    	fr.setId(1);
    	fr.setName("Strawbery");
    	fr.setColor("red");
    	fr.setRate(300);
    	
    	Mango m = new Mango();
    	m.setMid(02);
    	m.setPrice(500);
    	m.setVariety("Hapus");
    	
    	Orage o =new Orage();
    	o.setOid(11);
    	o.setOprice(50);
    	o.setOvariety("Oranges");
    	
    	fr.setMango(m);
    	fr.setOr(o);
    	
    	
    	
    	Transaction t = s.beginTransaction();
    	s.save(fr);
    	
    	t.commit();
    	s.close();
    	factory.close();
	}

}
