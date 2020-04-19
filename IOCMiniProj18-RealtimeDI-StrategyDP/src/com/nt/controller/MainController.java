package com.nt.controller;

import com.nt.dto.StudentDTO;
import com.nt.service.StudentOperationsService;
import com.nt.vo.StudentVO;

public class MainController {
	private StudentOperationsService service;

	public MainController(StudentOperationsService service) {
		System.out.println("MainController::1-param constructor");
		this.service = service;
	}
	
	public String handleStudent(StudentVO vo)throws Exception{
		StudentDTO dto=null;
		String result=null;
		//convert VO to DTO
		dto=new StudentDTO();
		dto.setSno(vo.getSno());
		dto.setSname(vo.getSname());
		dto.setSadd(vo.getSadd());
		dto.setM1(Integer.parseInt(vo.getM1()));
		dto.setM2(Integer.parseInt(vo.getM2()));
		dto.setM3(Integer.parseInt(vo.getM3()));
		//use service
		result=service.register(dto);
		return result;
		
	}//handleStudent
}//MainController
