package org.xworkz.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.xworkz.mvc.dao.MatrimonyDAO;
import org.xworkz.mvc.dto.MatrimonyDTO;

@Component
public class MatrimonyServiceImpl implements MatrimonyService {
	
	@Autowired
	private MatrimonyDAO matrimonyDAO;

	public MatrimonyServiceImpl() {
	System.out.println("Created \t"+this.getClass().getTypeName());
	}

	@Override
	public boolean validateAndSave(MatrimonyDTO dto) {
		System.out.println("invoked validate and save in service" + dto);
		this.matrimonyDAO.save(dto);	
		// TODO Auto-generated method stub
		return true;
	}

}
