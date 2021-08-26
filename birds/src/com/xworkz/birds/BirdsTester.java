package com.xworkz.birds;

import com.xworkz.birds.dao.BirdsDAO;
import com.xworkz.birds.dao.BirdsDAOImpl;
import com.xworkz.birds.entity.BirdsEntity;

public class BirdsTester {

	public static void main(String[] args) {

		BirdsEntity entity = new BirdsEntity(3, "HonBill", true, "yellow and Black", "Monogamous", 30.5f, 2.5f, true,
				false, "black");

		BirdsDAO dao = new BirdsDAOImpl();
		dao.save(entity);
		dao.readById(1);
	}

}
