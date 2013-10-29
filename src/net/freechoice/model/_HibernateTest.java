package net.freechoice.model;

import java.sql.Timestamp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

@SuppressWarnings("deprecation")
public class _HibernateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SessionFactory sf = 
				new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = null;
		
		session = sf.openSession();
		Transaction trans = session.beginTransaction();
		
		FC_Comment comment = new FC_Comment();
		comment.setComment("777test comment3");
		comment.setEmail("777nowhere3@mail.com");
		comment.setName("777anno5");
		comment.setTime_posted(new Timestamp(2013, 10, 28, 23, 10, 59, 2));
		
		int id = (Integer)session.save(comment);
		
		System.out.println("OK, the id is " + id);
		trans.commit();

		session.clear();
		sf.close();
		
	}

}









