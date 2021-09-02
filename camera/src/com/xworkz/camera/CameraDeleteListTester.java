package com.xworkz.camera;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.camera.dao.CameraDAO;
import com.xworkz.camera.dao.CameraDAOImpl;

public class CameraDeleteListTester {

	public static void main(String[] args) {

		CameraDAO dao = new CameraDAOImpl();

		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.remove(list);
	}

}
