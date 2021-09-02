package com.xworkz.camera;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.camera.dao.CameraDAO;
import com.xworkz.camera.dao.CameraDAOImpl;
import com.xworkz.camera.entity.CameraEntity;

public class CameraSaveListTester {

	public static void main(String[] args) {

		CameraEntity entity = new CameraEntity("Sony", "DSC W830", "Blue", 5000.00, 500.00, "20 Mega Pixel Camera",
				"Zoom", "Panorama", "Amazon");
		CameraEntity entity1 = new CameraEntity("Panasonic", "DMC-G7KGW-K", "Black", 35000.00, 1.0, "Live View", "Zoom",
				"High Dynamic Range", "Flipkart");
		CameraEntity entity2 = new CameraEntity("Nikon", "D7500", "Pink", 78999.00, 3.0, "Miniature effect", "Custom",
				"Automatic", "Flipkart");

		CameraDAO dao = new CameraDAOImpl();

		List<CameraEntity> camList = new ArrayList();
		camList.add(entity);
		camList.add(entity1);
		camList.add(entity2);

		dao.saveList(camList);

	}

}
