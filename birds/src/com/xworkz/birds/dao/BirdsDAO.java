package com.xworkz.birds.dao;

import com.xworkz.birds.entity.BirdsEntity;

public interface BirdsDAO {

	public int save(BirdsEntity enity);

	public BirdsEntity readById(int id);

}
