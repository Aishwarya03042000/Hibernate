package com.xworkz.camera.util;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SFUtil {

	private static SessionFactory factory;

	public static SessionFactory getFactory() {
		if (factory != null && factory.isClosed()) {
			throw new IllegalStateException("Someone closed SessionFactory, please correct the code");
		}
		return factory;
	}

	static {
		try {
			System.out.println("SF init started ");
			Configuration conf = new Configuration().configure();
			factory = conf.buildSessionFactory();
			System.out.println("SF init closed ");
		} catch (HibernateException he) {
			System.out.println("Error in static block ");
			he.printStackTrace();
		}
	}

}
