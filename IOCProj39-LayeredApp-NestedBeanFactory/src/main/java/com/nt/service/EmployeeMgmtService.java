package com.nt.service;

import java.util.List;

import com.nt.dto.EmployeeDTO;

public interface EmployeeMgmtService {
	
	public List<EmployeeDTO> fetchEmployeeByDesgs(String desg1,String desg2)throws Exception;
	
}
