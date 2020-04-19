package com.nt.service;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentDAO;
import com.nt.dto.StudentDTO;

public class StudentOperationsServiceImpl implements StudentOperationsService {
	private StudentDAO dao;
	
	
	public StudentOperationsServiceImpl(StudentDAO dao) {
		System.out.println("StudentOperationsServiceImpl::1-param constructor");
		this.dao = dao;
	}


	@Override
	public String register(StudentDTO dto) throws Exception {
		int total=0;
		float avg=0.0f;
		String result=null;
		StudentBO bo=null;
		int count=0;
		//write b.logic to total,avg and result
		total=dto.getM1()+dto.getM2()+dto.getM3();
		avg=total/3.0f;
		if(dto.getM1()<35||dto.getM2()<35||dto.getM3()<35)
			result="FAIL";
		else
			result="PASS";
		//prepare BO class object having Persistable data
		bo=new StudentBO();
		bo.setSname(dto.getSname());
		bo.setSadd(dto.getSadd());
		bo.setTotal(total);
		bo.setAvg(avg);
		bo.setResult(result);
		//use DAO
		count=dao.insert(bo);
		//process the result
		if(count==0)
			return "Student Registration Failed";
		else
			return "Student Registration Succeeded and Total="+total+" "+"Average="+avg+" "+"Result="+result;
	}

}
