package com.xworkz.birds.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.birds.entity.BirdsEntity;

public class BirdsDAOImpl implements BirdsDAO {

	public int save(BirdsEntity entity) {

		Configuration conf = new Configuration().configure().addAnnotatedClass(BirdsEntity.class);

		SessionFactory fact = conf.buildSessionFactory();

		Session session = fact.openSession();

		Transaction trans = session.beginTransaction();

		int pk = (int) session.save(entity);
		trans.commit();
		System.out.println(pk);
		session.close();
		fact.close();
		return pk;

	}

	@Override
	public BirdsEntity readById(int id) {

		Configuration conf = new Configuration().configure().addAnnotatedClass(BirdsEntity.class);
		SessionFactory fact = conf.buildSessionFactory();
		Session session = fact.openSession();
		// Transaction trans = session.beginTransaction();

		BirdsEntity ref = (BirdsEntity) session.get(BirdsEntity.class, id);
		System.out.println(ref);
		return ref;
	}

}
