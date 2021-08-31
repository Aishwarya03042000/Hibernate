package com.xworkz.camera.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.camera.entity.CameraEntity;
import com.xworkz.camera.util.SFUtil;

public class CameraDAOImpl implements CameraDAO {

	private SessionFactory factory = SFUtil.getFactory();

	@Override
	public int save(CameraEntity entity) {
		try (Session sess = factory.openSession()) {
			Transaction trans = sess.beginTransaction();
			int pk = (int) sess.save(entity);
			trans.commit();
			System.out.println(entity);
			return pk;
		}
	}

	@Override
	public CameraEntity readById(int id) {
		try (Session sess = factory.openSession()) {
			CameraEntity entity = sess.get(CameraEntity.class, id);
			System.out.println("Read: ");
			return entity;
		}
	}

	@Override
	public void updateByBrandId(int id, String brand) {
		try (Session sess = factory.openSession()) {
			Transaction trans = sess.beginTransaction();
			CameraEntity entity = sess.get(CameraEntity.class, id);
			entity.setBrand(brand);
			System.out.println("Update by barnd: ");
			trans.commit();
		}
	}

	@Override
	public void deleteById(int id) {
		try (Session sess = factory.openSession()) {
			Transaction trans = sess.beginTransaction();
			CameraEntity entity = sess.get(CameraEntity.class, id);
			sess.delete(entity);
			System.out.println("Deleted by Id: ");
			trans.commit();

		}
	}

}
