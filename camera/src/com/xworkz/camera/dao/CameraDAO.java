package com.xworkz.camera.dao;

import java.util.List;

import com.xworkz.camera.entity.CameraEntity;

public interface CameraDAO {

	public int save(CameraEntity entity);

	public CameraEntity readById(int id);

	void updateByBrandId(int id, String brand);

	void deleteById(int id);

	void saveList(List<CameraEntity> entity);

	void deleteList(List<Integer> ids);

}
