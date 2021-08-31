package com.xworkz.camera.dao;

import com.xworkz.camera.entity.CameraEntity;

public interface CameraDAO {

	public int save(CameraEntity entity);

	public CameraEntity readById(int id);

	void updateByBrandId(int id, String brand);

	void deleteById(int id);

}
