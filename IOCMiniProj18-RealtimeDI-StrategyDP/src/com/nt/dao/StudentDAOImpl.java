package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.StudentBO;

public final class StudentDAOImpl implements StudentDAO {                        //DAO class holds Persistent logic
	private static final String INSERT_STUDENT_QUERY="INSERT INTO SPRING_LAYERED_STUDENT VALUES(?,?,?,?,?,?)";
	
	private DataSource ds;
	
	public StudentDAOImpl(DataSource ds) {
		System.out.println("StudentDAOImpl::1-param constructor");
		this.ds = ds; 
	}
	
	 public int insert(StudentBO bo) throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
		//get Pooled JDBC con object using the DataSource object
		con=ds.getConnection();
		//create JDBC PreparedStatement object having preCompiled Query
		ps=con.prepareStatement(INSERT_STUDENT_QUERY);
		//set values to query params by gathering BO class object
		ps.setInt(1,bo.getSno());
		ps.setString(2,bo.getSname());
		ps.setString(3,bo.getSadd());
		ps.setInt(4,bo.getTotal());
		ps.setFloat(5,bo.getAvg());
		ps.setString(6,bo.getResult());
		//execute the preCompiled SQL query
		count=ps.executeUpdate();
		return count;
	}

}
