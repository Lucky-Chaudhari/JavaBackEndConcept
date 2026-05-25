package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Employee;
import com.utils.MyDatabase;

public class EmployeeDao {
	
	public int insertEmployee(Employee e){
		int result=0;
		String sql="insert into Employee(name,designation,company,salary)value(?,?,?,?)";
		try(Connection con=MyDatabase.createConnection();PreparedStatement pst=con.prepareStatement(sql)) {
	pst.setString(1, e.getName());
	pst.setString(2, e.getDesignation());
	pst.setString(3, e.getCompany());
	pst.setDouble(4, e.getSalary());
			result=pst.executeUpdate();
			
		}catch(SQLException e1) {
			e1.printStackTrace();
		}
		
		return result;
	}
	
	public int deleteEmpolyeeById(int id) {
		int result=0;
		String sql="delete from Employee where id=?";
		try(Connection con = MyDatabase.createConnection();PreparedStatement pst=con.prepareStatement(sql)){
			pst.setInt(1, id);
			result=pst.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return result;
	}
	
	public Employee findEmployeeById(int id){
		
		List<Employee> list=new ArrayList();
		String sql="select id,name,designation,company,salary from Employee where id=?";
		try(Connection con=MyDatabase.createConnection(); PreparedStatement pst=con.prepareStatement(sql))
		{
			pst.setInt(1, id);
			ResultSet rs=pst.executeQuery();
			list.addAll(MyDatabase.employeeRowMapper(rs));
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return (list.isEmpty())?null:list.get(0);
	}
	public List<Employee> findAllEmployee(){
		List<Employee> list= new ArrayList();
		String sql="select id,name,designation,company,salary from Employee";
		try(Connection con=MyDatabase.createConnection(); PreparedStatement pst=con.prepareStatement(sql);ResultSet rs=pst.executeQuery();)
		{
			list.addAll(MyDatabase.employeeRowMapper(rs));
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
		
	}
}
