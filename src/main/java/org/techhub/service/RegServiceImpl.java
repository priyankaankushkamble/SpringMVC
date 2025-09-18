package org.techhub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.techhub.Register;
import org.techhub.repository.RegRepo;

@Service("regService")
public class RegServiceImpl implements RegService{

	@Autowired
	RegRepo regRepo;
	@Override
	public boolean isRegister(Register model) {
		// TODO Auto-generated method stub
		return regRepo.isRegister(model);
	}

}
