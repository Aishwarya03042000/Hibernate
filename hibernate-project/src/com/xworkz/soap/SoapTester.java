package com.xworkz.soap;

import com.xworkz.soap.constant.SoapType;
import com.xworkz.soap.dao.SoapDAO;
import com.xworkz.soap.dao.SoapDAOImpl;
import com.xworkz.soap.dto.SoapDTO;

public class SoapTester {

	public static void main(String[] args) {

		SoapDTO dto = new SoapDTO(5, "Manya", "almond", true, true, SoapType.BABY);

		SoapDAO dao = new SoapDAOImpl();
		dao.save(dto);

	}

}
