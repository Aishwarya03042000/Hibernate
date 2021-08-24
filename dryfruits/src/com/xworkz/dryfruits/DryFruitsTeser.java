package com.xworkz.dryfruits;

import com.xworkz.dryfruits.dao.DryFruitsDAO;
import com.xworkz.dryfruits.dao.DryFruitsDAOImpl;
import com.xworkz.dryfruits.dto.DryFruitsDTO;

public class DryFruitsTeser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DryFruitsDTO dto = new DryFruitsDTO(5, "Raisins", "Nutri Organics", "California", 890, "grofers");

		DryFruitsDAO dao = new DryFruitsDAOImpl();
		dao.save(dto);

	}

}
