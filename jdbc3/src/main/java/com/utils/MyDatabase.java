package com.utils;


import java.util.ArrayList;
import java.util.List;

import com.model.Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MyDatabase {

	public static Connection createConnection() {
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		con=	DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	public  static List<Employee> employeeRowMapper(ResultSet rs) throws SQLException {
		List<Employee> list= new ArrayList();
		while(rs.next()) {
			Employee e=new Employee();
			e.setId(rs.getInt("id"));
			e.setName(rs.getString("name"));
			e.setDesignation(rs.getString("designation"));
			e.setCompany(rs.getString("company"));
			e.setSalary(rs.getDouble("salary"));
			list.add(e);
		}
		return list;
	}
}
