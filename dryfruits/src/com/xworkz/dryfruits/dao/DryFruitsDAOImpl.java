package com.xworkz.dryfruits.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.dryfruits.dto.DryFruitsDTO;

public class DryFruitsDAOImpl implements DryFruitsDAO {

	@Override
	public int save(DryFruitsDTO entity) {

		Configuration conf = new Configuration();
		conf.configure();
		conf.addAnnotatedClass(DryFruitsDTO.class);
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
