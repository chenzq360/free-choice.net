


package net.freechoice.dao.impl;

import net.freechoice.model.FC_User;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.springframework.orm.hibernate3.HibernateTemplate;

@SuppressWarnings("deprecation")
public class _Test {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class<FC_User> typeClass = FC_User.class;

		System.out.println(typeClass.getName());
		
		System.out.println(typeClass.getCanonicalName());

		System.out.println(typeClass.getSimpleName());
		
		
//		System.out.println((this == i2));

//		System.out.println(typeClass.get);
//
//		long t2 = System.nanoTime();
//		SessionFactory s= new AnnotationConfiguration().configure().buildSessionFactory();
//		
//		long t1 = System.nanoTime();
//		HibernateTemplate ht = new HibernateTemplate(s);
//		
//		System.out.println( (t2 - t1) / 1000000000);
	}

}
