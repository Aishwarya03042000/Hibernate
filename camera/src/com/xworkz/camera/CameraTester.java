package com.xworkz.camera;

import com.xworkz.camera.dao.CameraDAO;
import com.xworkz.camera.dao.CameraDAOImpl;
import com.xworkz.camera.entity.CameraEntity;

public class CameraTester {

	public static void main(String[] args) {

		CameraEntity entity = new CameraEntity("Canon", "EF S18-55", "black", 30500.00, 2.0, "Wind filter provide",
				"zoom", "Manual", "Amazon");

		CameraDAO dao = new CameraDAOImpl();
		dao.save(entity);

		dao.readById(1);

		dao.updateByBrandId(1, "Nikon");

		dao.deleteById(1);

	}

}
