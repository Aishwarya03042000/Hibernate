package com.xworkz.soap.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.soap.dto.SoapDTO;

public class SoapDAOImpl implements SoapDAO {

	@Override
	public int save(SoapDTO entity) {

		Configuration conf = new Configuration();
		conf.configure();
		conf.addAnnotatedClass(SoapDTO.class);
		SessionFactory fact = conf.buildSessionFactory();
		Session sess = fact.openSession();
		Transaction trans = sess.beginTransaction();
		int primaryKey = (int) sess.save(entity);
		trans.commit();
		System.out.println(primaryKey);
		sess.close();
		fact.close();

		return primaryKey;
	}

}
